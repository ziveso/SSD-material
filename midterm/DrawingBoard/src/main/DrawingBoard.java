package main;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import objects.*;

public class DrawingBoard extends JPanel {

	private MouseAdapter mouseAdapter; 
	private List<GObject> gObjects;
	private GObject target;
	
	private int gridSize = 10;
	
	public DrawingBoard() {
		gObjects = new ArrayList<GObject>();
		mouseAdapter = new MAdapter();
		addMouseListener(mouseAdapter);
		addMouseMotionListener(mouseAdapter);
		setPreferredSize(new Dimension(600, 400));
	}
	
	public void addGObject(GObject gObject) {
		gObjects.add(gObject);
		repaint();
	}
	
	public void groupAll() {
		CompositeGObject composite = new CompositeGObject();
		for(GObject o : gObjects) {
			o.deselected();
			composite.add(o);
		}
		gObjects.clear();
		gObjects.add(composite);
		repaint();
	}

	public void deleteSelected() {
		gObjects.remove(target);
		repaint();
	}
	
	public void clear() {
		gObjects.clear();
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintBackground(g);
		paintGrids(g);
		paintObjects(g);
	}

	private void paintBackground(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	private void paintGrids(Graphics g) {
		g.setColor(Color.lightGray);
		int gridCountX = getWidth() / gridSize;
		int gridCountY = getHeight() / gridSize;
		for (int i = 0; i < gridCountX; i++) {
			g.drawLine(gridSize * i, 0, gridSize * i, getHeight());
		}
		for (int i = 0; i < gridCountY; i++) {
			g.drawLine(0, gridSize * i, getWidth(), gridSize * i);
		}
	}

	private void paintObjects(Graphics g) {
		for (GObject go : gObjects) {
			go.paint(g);
		}
	}

	class MAdapter extends MouseAdapter {

		private int lastX;
		private int lastY;
		
		private void deselectAll() {
			for(GObject o : gObjects) {
				o.deselected();
			}
			target = null;
			repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			deselectAll();
			for(GObject o : gObjects) {
				if(o.pointerHit(e.getX(), e.getY())) {
					o.selected();
					target = o;
					break;
				}
			}
			lastX = e.getX();
			lastY = e.getY();
			repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			int dX = e.getX() - lastX;
			int dY = e.getY() - lastY;
			target.move(dX, dY);
			lastX = e.getX();
			lastY = e.getY();
			repaint();
		}
	}
	
}
package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompositeGObject extends GObject {

	private List<GObject> gObjects;

	public CompositeGObject() {
		super(0, 0, 0, 0);
		gObjects = new ArrayList<GObject>();
	}

	public void add(GObject gObject) {
		gObjects.add(gObject);
		recalculateRegion();
	}

	public void remove(GObject gObject) {
		gObjects.remove(gObject);
		recalculateRegion();
	}

	@Override
	public void move(int dX, int dY) {
		super.move(dX, dY);
		for(GObject o : gObjects) {
			o.move(dX, dY);
		}
		recalculateRegion();
	}
	
	public void recalculateRegion() {
		x = y = Integer.MAX_VALUE;
		for(GObject o : gObjects) {
			x = (o.x < x)? o.x : x;
			y = (o.y < y)? o.y : y;
		}

		width = height = Integer.MIN_VALUE;
		for(GObject o : gObjects) {
			width = (o.x + o.width > x + width)? o.x + o.width - x : width;
			height = (o.y + o.height > y + height)? o.y + o.height - y : height;
		}
	}

	@Override
	public void paintObject(Graphics g) {
		for(GObject o : gObjects) {
			o.paintObject(g);
		}
	}

	@Override
	public void paintLabel(Graphics g) {
		g.setColor(Color.black);
		g.drawString("Group", x, y + height + 20);
	}
	
}

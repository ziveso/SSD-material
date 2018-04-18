import java.awt.Color;
import java.awt.Graphics;

public class CanvasedImage extends Image {
	
	private Image image;
	private Color color;
	private int thickness = 6;

	public CanvasedImage(Image image , Color color) {
		this.image = image;
		this.color = color;
		this.x = image.getX() - thickness;
		this.y = image.getY() - thickness;
		this.width = image.getWidth() + 2 * thickness;
		this.height = image.getHeight() + 2 * thickness;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(x, y, width, height);
		image.draw(g);
	}

}

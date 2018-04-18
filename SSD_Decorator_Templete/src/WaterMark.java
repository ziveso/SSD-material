import java.awt.Color;
import java.awt.Graphics;

public class WaterMark extends Image{
	private Image image;
	private String watermark;
	
	public WaterMark(Image image, String watermark) {
		this.image = image;
		this.x = image.getX();
		this.y = image.getY();
		this.width = image.getWidth();
		this.height = image.getHeight();
		this.watermark = watermark;
	}
	
	@Override
	public void draw(Graphics g) {
		image.draw(g);
		g.setColor(Color.black);
		g.drawString(this.watermark, x, this.getHeight() + this.getY());
	}

}

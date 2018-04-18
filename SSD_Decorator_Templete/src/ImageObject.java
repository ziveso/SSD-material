import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageObject extends Image {

    private BufferedImage bi;

    public ImageObject(int x, int y){
        try {
            bi = ImageIO.read(new File("Image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.width = bi.getWidth();
        this.height = bi.getHeight();
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.drawImage(bi, x, y, null);
    }
}

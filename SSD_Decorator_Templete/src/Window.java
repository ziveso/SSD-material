import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private Image img;

    public Window(Image img) {
        setSize(480, 400);
        this.img = img;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        img.draw(g);
    }
}

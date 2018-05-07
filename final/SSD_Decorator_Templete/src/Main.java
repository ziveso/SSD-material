import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageObject img1 = new ImageObject(80, 100);

        WaterMark wm = new WaterMark(img1,"Helloworld");
        
        CanvasedImage c1 = new CanvasedImage(wm, Color.red);
        
        CanvasedImage c2 = new CanvasedImage(c1, Color.blue);
        
        
        Window window = new Window(c2);
        window.setVisible(true);
    }

}

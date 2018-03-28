import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class Gui extends JFrame implements Observer {

    private Game game;

    private Renderer renderer;

    public Gui() {
        game = new Game();
        game.addObserver(this);

        renderer = new Renderer();
        renderer.addMouseListener(new Controller());

        setLayout(new BorderLayout());
        add(renderer);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public void start() {
        setVisible(true);
    }

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.start();
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

    class Renderer extends JPanel {

        public Renderer() {
            setDoubleBuffered(true);
            setPreferredSize(new Dimension(game.getWidth(), game.getHeight()));
            setPlayerSprite();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // Draw space
            g.setColor(Color.black);
            g.fillRect(0, 0, game.getWidth(), game.getHeight());
            // Draw bullets
            g.setColor(Color.green);
            for(Bullet bullet : game.getBullets()) {
                g.fillOval(bullet.getX(), bullet.getY(), 10, 10);
            }
            // Draw HUD
            g.setColor(Color.white);
            g.drawString("Bullet Count: " + game.getBullets().size(), 50, 50);
        }

        private void setPlayerSprite() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage("img/Player.png");
            Cursor c = toolkit.createCustomCursor(image , new Point(this.getX(),
                    this.getY()), "Player");
            this.setCursor (c);
        }

    }

    class Controller extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            int offSet = 30;
            game.burstBullets(e.getX() + offSet, e.getY() + offSet);
        }
    }
}

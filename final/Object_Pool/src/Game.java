import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Game extends Observable {

	private int width = 600;
	private int height = 600;

	private List<Bullet> bullets;
	private Thread mainLoop;
	private boolean alive;

	public Game() {
		alive = true;
		bullets = BulletPool.getInstance().getBullets();
		mainLoop = new Thread() {
			@Override
			public void run() {
				while (alive) {
					tick();
					setChanged();
					notifyObservers();
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		mainLoop.start();
	}

	public void tick() {
		moveBullets();
		cleanupBullets();
	}

	private void moveBullets() {
		for (Bullet bullet : bullets) {
			bullet.move();
		}
	}

	private void cleanupBullets() {
		List<Bullet> toRemove = new ArrayList<Bullet>();
		for (Bullet bullet : bullets) {
			if (bullet.getX() <= 0 || bullet.getX() >= width || bullet.getY() <= 0 || bullet.getY() >= height) {
				toRemove.add(bullet);
			}
		}
		for (Bullet bullet : toRemove) {
			bullet.setActive(false);
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public List<Bullet> getBullets() {
		return bullets;
	}

	public void burstBullets(int x, int y) {
		BulletPool pool = BulletPool.getInstance();
		Bullet b1 = pool.getAvaliableBullets();
		b1.setNewBullet(x, y, 1, 0);

		Bullet b2 = pool.getAvaliableBullets();
		b2.setNewBullet(x, y, 0, 1);

		Bullet b3 = pool.getAvaliableBullets();
		b3.setNewBullet(x, y, -1, 0);

		Bullet b4 = pool.getAvaliableBullets();
		b4.setNewBullet(x, y, 0, -1);

		Bullet b5 = pool.getAvaliableBullets();
		b5.setNewBullet(x, y, 1, 1);

		Bullet b6 = pool.getAvaliableBullets();
		b6.setNewBullet(x, y, 1, -1);

		Bullet b7 = pool.getAvaliableBullets();
		b7.setNewBullet(x, y, -1, 1);

		Bullet b8 = pool.getAvaliableBullets();
		b8.setNewBullet(x, y, -1, -1);
		// bullets.add(new Bullet(x, y, 1, 0));
		// bullets.add(new Bullet(x, y, 0, 1));
		// bullets.add(new Bullet(x, y, -1, 0));
		// bullets.add(new Bullet(x, y, 0, -1));
		// bullets.add(new Bullet(x, y, 1, 1));
		// bullets.add(new Bullet(x, y, 1, -1));
		// bullets.add(new Bullet(x, y, -1, 1));
		// bullets.add(new Bullet(x, y, -1, -1));
	}
}

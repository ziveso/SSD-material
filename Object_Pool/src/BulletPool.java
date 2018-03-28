import java.util.ArrayList;
import java.util.List;

public class BulletPool {
	private static BulletPool instance = new BulletPool();

	private List<Bullet> bullets = new ArrayList<>();

	private BulletPool() {
		for (int i = 0; i < 100; i++) {
			bullets.add(new Bullet(-10, -10, 0, 0));
		}
	}

	public static BulletPool getInstance() {
		return BulletPool.instance;
	}

	public Bullet getAvaliableBullets() {
		for (Bullet bullet : bullets) {
			if (!bullet.getActive()) {
				return bullet;
			}
		}
		return null;
	}

	public List<Bullet> getBullets() {
		return this.bullets;
	}
}

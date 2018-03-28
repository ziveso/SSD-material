public class Bullet {

	private int x;
	private int y;

	private int dx;
	private int dy;

	private boolean active = false;

	private int speed = 10;

	public Bullet(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}

	public void move() {
		x += dx * speed;
		y += dy * speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setNewBullet(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.active = true;
	}
}

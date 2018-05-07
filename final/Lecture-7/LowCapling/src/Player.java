
public class Player {

	private Weapon weapon;

	public void setWeapon(Weapon w) {
		this.weapon = w;
	}

	private void attack(Player p) {
		weapon.attack(p);
	}

	public static void main(String[] args) {
		Player p = new Player();
		p.setWeapon(new Gun());
		Player p2 = new Player();
		p.attack(p2);
	}
}

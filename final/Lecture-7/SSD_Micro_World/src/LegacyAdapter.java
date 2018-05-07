
public class LegacyAdapter implements IUnit {

	private LegacyUnit unit;
	private String name = "Legacy Unit";

	public LegacyAdapter(LegacyUnit LU) {
		this.unit = LU;
	}

	@Override
	public void move() {
		unit.move();
	}

	@Override
	public int getX() {
		return unit.getX();
	}

	@Override
	public int getY() {
		return unit.getY();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getHealth() {
		return 999;
	}

	@Override
	public boolean dead() {
		return false;
	}

}

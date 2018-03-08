
public class Player {

	public int rollDie(Die[] dice) {
		int sum = 0;
		for (Die d : dice) {
			d.roll();
			sum += d.getFace();
		}
		return sum;
	}
}

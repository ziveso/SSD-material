
public class Game {

	private Die[] dice;
	private Player player;

	public Game() {
		dice = new Die[2];
		for (int i = 0; i < dice.length; i++)
			dice[i] = new Die();
		player = new Player();
	}

	public void start() {
		int result = player.rollDie(dice);
		if (result >= 7) {
			System.out.println("Player win.");
		} else {
			System.out.println("Player loss.");
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class World extends Observable {

	private int tick;
	private int size;

	private Player player;
	private Thread thread;
	private boolean notOver;
	private long delayed = 500;
	private int enemyCount = 10;

	private Enemy[] enemies;

	private List<Command> histories = new ArrayList<>();
	private boolean replayMode = false;

	public World(int size) {
		this.size = size;
		tick = 0;
		player = new Player(size / 2, size / 2);
		enemies = new Enemy[enemyCount];
		Random random = new Random();
		for (int i = 0; i < enemies.length; i++) {
			enemies[i] = new Enemy(random.nextInt(size), random.nextInt(size));
		}
	}

	public void start() {
		player.reset();
		player.setPosition(size / 2, size / 2);
		tick = 0;
		notOver = true;
		thread = new Thread() {
			@Override
			public void run() {
				while (notOver) {
					if (replayMode) {
						injectHistoryCommand();
					}
					tick++;
					player.move();
					checkCollisions();
					setChanged();
					notifyObservers();
					waitFor(delayed);
				}
			}
		};
		thread.start();
	}

	private void injectHistoryCommand() {
		for (Command history : histories) {
			if (history.getTick() == tick) {
				history.execute();
			}
		}
	}

	public void setReplayMode() {
		replayMode = true;
	}

	private void checkCollisions() {
		for (Enemy e : enemies) {
			if (e.hit(player)) {
				notOver = false;
			}
		}
	}

	private void waitFor(long delayed) {
		try {
			Thread.sleep(delayed);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getTick() {
		return tick;
	}

	public int getSize() {
		return size;
	}

	public Player getPlayer() {
		return player;
	}

	public void turnPlayerNorth() {
		Command command = new CommandNorth(tick, player);
		command.execute();
		histories.add(command);
		// player.turnNorth();
	}

	public void turnPlayerSouth() {
		Command command = new CommandSouth(tick, player);
		command.execute();
		histories.add(command);
		// player.turnSouth();
	}

	public void turnPlayerWest() {
		Command command = new CommandWest(tick, player);
		command.execute();
		histories.add(command);
		// player.turnWest();
	}

	public void turnPlayerEast() {
		Command command = new CommandEast(tick, player);
		command.execute();
		histories.add(command);
		// player.turnEast();
	}

	public Enemy[] getEnemies() {
		return enemies;
	}

	public boolean isGameOver() {
		return !notOver;
	}
}

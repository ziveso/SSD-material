
public class CommandWest extends Command {

	public CommandWest(int tick, Player player) {
		super(tick, player);
	}

	@Override
	public void execute() {
		getPlayer().turnWest();
	}

}

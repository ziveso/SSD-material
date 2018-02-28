package strategy;

public class StyleCap implements Style {

	@Override
	public String format(String s) {
		return s.substring(0, 1);
	}

}

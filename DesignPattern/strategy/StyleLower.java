package strategy;

public class StyleLower implements Style {

	@Override
	public String format(String s) {
		return s.toLowerCase();
	}
}

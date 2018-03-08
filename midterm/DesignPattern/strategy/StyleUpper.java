package strategy;

public class StyleUpper implements Style {

	@Override
	public String format(String s) {
		return s.toUpperCase();
	}

}

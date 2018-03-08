package strategy;

public class Printer {private Style style;
	
	public Printer(Style style) {
		this.style = style;
	}
	
	public void print(String s) {
		System.out.println(style.format(s));
		
//		if (style == STYLE_LOWER) {
//			System.out.println(s.toLowerCase());
//		} else if (style == STYLE_UPPER) {
//			System.out.println(s.toUpperCase());
//		} else if (style == STYLE_CAP) {
//			String output = s.substring(0, 1);
//			System.out.println();
//		} else {
//			System.out.println("Please set style");
//		}
	}
}

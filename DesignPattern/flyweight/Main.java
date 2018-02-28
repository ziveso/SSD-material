package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		byte[] fontResources = new byte[1000 * 1000];
		
		List<Font> doc = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			doc.add(new Font(fontResources));
		}
	}

}

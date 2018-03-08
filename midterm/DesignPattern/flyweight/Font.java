package flyweight;

public class Font {

	private byte[] resources;

	public Font(byte[] fontResources) {
		resources = fontResources;
	}
	
	public byte[] getResources() {
		return resources;
	}

}

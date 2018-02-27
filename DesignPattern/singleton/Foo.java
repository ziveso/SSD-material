package singleton;

public class Foo {

	public static Foo instance = new Foo();

	private int value;

	private Foo() {
		value = (int) (Math.random() * 100);
	}

	public int getValue() {
		return value;
	}


}

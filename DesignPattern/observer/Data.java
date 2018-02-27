package observer;

import java.util.Observable;

public class Data extends SimpleObservable {

	private int value;

	public Data(int value) {
		this.value = value;
	}

	public void changeValue() {
		value++;
		setChanged();
		notifyObservers();
	}

	public int getValue() {
		return value;
	}
}

package observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable {

	private boolean changed;
	private List<SimpleObserver> observers = new ArrayList<>();

	public void setChanged() {
		changed = true;
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Object arg) {
		if (changed) {
			for (SimpleObserver o : observers) {
				o.update(this, arg);
			}
		}
		changed = false;
	}

	public void addObserver(SimpleObserver obs) {
		observers.add(obs);
	}
}

package observer;

import java.util.Observable;
import java.util.Observer;

public class ConsoleView implements SimpleObserver {

	private Data data;

	public ConsoleView(Data data) {
		this.data = data;
		data.addObserver(this);
	}

	public void render() {
		System.out.println(data.getValue());
	}

	@Override
	public void update(SimpleObservable o, Object arg) {
		render();
	}

}

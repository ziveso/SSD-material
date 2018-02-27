package observer;

public class App {
	public static void main(String[] args) {
		Data data = new Data(1);
		GuiView gView = new GuiView(data);
		ConsoleView cView = new ConsoleView(data);
		
		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					data.changeValue();
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		};
		t.start();
	}
}

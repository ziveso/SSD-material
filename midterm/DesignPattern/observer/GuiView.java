package observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiView extends JFrame implements SimpleObserver {

	private Data data;
	private JTextField textField = new JTextField();

	public GuiView(Data data) {
		super("Awesome gui");
		data.addObserver(this);
		this.data = data;
		add(textField);
		this.pack();
		setAlwaysOnTop(true);
		setVisible(true);
	}

	public void render() {
		textField.setText(data.getValue() + "");
	}

	@Override
	public void update(SimpleObservable o, Object arg) {
		this.render();
	}
}

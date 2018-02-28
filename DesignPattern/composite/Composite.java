package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> components = new ArrayList<>();

	public void add(Component c) {
		components.add(c);
	}

	@Override
	public String getName() {
		List<String> names = new ArrayList<String>();
		for (Component c : components) {
			names.add(c.getName());
		}
		return String.format("Group of (%s)", String.join(", ", names));
	}

}

import java.util.ArrayList;
import java.util.List;

interface Component {
	public void showPrice();
}

class Leaf implements Component {

	int price;
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	String name;

	@Override
	public void showPrice() {

		System.out.println(name + " : " + price);
	}
}

class Composite implements Component {

	

	String name;
	public Composite(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	List<Component> components = new ArrayList<>();

	public void addComponent(Component com) {
		components.add(com);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component c : components)
			c.showPrice();
	}

}

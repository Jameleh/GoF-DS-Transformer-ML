package br.edu.univas.si8.dp;

public class Live extends Decorator {
	
	protected Product p;
	protected Live(Product product) {
		super(product);
		this.p = product;
	}
	
	@Override
	public String getName() {
		return this.p.getName();
	}

	@Override
	public String getVersion() {
		return this.p.getVersion().concat("Live");
	}

	@Override
	public float getPrice() {
		return this.p.getPrice();
	}

	@Override
	public float getAddVersionPrice() {
		return 0;
	}

	@Override
	public float getTotalPrice() {
		float a = getPrice();
		float b = getAddVersionPrice();
		float c = a + b;
		return c;
	}
}

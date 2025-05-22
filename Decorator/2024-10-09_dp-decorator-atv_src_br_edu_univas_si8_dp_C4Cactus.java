package br.edu.univas.si8.dp;

public class C4Cactus implements Product {
	
	private String name = "C4 Cactus";
	private String version = "";
	private float price = 10000;
	private float addVersionPrice = 0;
	private float totalPrice = (price + addVersionPrice);
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getVersion() {
		return this.version;
	}

	@Override
	public float getPrice() {
		return this.price;
	}

	@Override
	public float getAddVersionPrice() {
		return this.addVersionPrice;
	}

	@Override
	public float getTotalPrice() {
		return this.totalPrice;
	}
}

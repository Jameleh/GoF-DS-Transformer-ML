package br.edu.univas.si8.dp;

public class Decorator implements Product {
	
	protected Product c4Cactus;
	protected Decorator(Product c4Cactus) {
		this.c4Cactus = c4Cactus;
	}
	
	@Override
	public String getName() {
		return this.c4Cactus.getName();
	}

	@Override
	public String getVersion() {
		return this.c4Cactus.getVersion();
	}

	@Override
	public float getPrice() {
		return this.c4Cactus.getPrice();
	}

	@Override
	public float getAddVersionPrice() {
		return this.c4Cactus.getAddVersionPrice();
	}

	@Override
	public float getTotalPrice() {
		return this.c4Cactus.getTotalPrice();
	}
}

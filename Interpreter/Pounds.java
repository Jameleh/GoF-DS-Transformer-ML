
public class Pounds extends Expression{
	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity * 12.08);
	}

	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity * 1.34);
	}

	@Override
	public String euros(double quantity) {
		return Double.toString(quantity * 1.11);
	}

	@Override
	public String yen(double quantity) {
		return Double.toString(quantity * 139.99);
	}

	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity * 8.78);
	}
}

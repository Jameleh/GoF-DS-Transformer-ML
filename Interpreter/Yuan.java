
public class Yuan extends Expression{
	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity * 1.38);
	}

	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity * 0.15);
	}

	@Override
	public String euros(double quantity) {
		return Double.toString(quantity * 0.13);
	}

	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity * 0.11);
	}

	@Override
	public String yen(double quantity) {
		return Double.toString(quantity * 15.95);
	}
}


public class Euros extends Expression{
	@Override
	public String euros(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity * 10.89);
	}

	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity * 1.21);
	}

	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity * 0.90);
	}

	@Override
	public String yen(double quantity) {
		return Double.toString(quantity * 126.27);
	}

	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity * 7.92);
	}
}

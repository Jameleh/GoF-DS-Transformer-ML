
public class Yen extends Expression{
	@Override
	public String yen(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity * 0.086);
	}

	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity * 0.0096);
	}

	@Override
	public String euros(double quantity) {
		return Double.toString(quantity * 0.0079);
	}

	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity * 0.0071);
	}

	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity * 0.063);
	}
}

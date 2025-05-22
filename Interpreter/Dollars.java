
public class Dollars extends Expression{
	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity * 8.98);
	}

	@Override
	public String euros(double quantity) {
		return Double.toString(quantity*0.82);
	}

	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity * 0.74);
	}

	@Override
	public String yen(double quantity) {
		return Double.toString(quantity * 104.16);
	}

	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity * 6.53);
	}
}

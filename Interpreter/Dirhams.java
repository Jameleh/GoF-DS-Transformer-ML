
public class Dirhams extends Expression{

	@Override
	public String dirhams(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String dollars(double quantity) {
		return Double.toString(quantity * 0.11);
	}

	@Override
	public String euros(double quantity) {
		return Double.toString(quantity*0.92);
	}

	@Override
	public String pounds(double quantity) {
		return Double.toString(quantity * 0.083);
	}

	@Override
	public String yen(double quantity) {
		return Double.toString(quantity * 11.62);
	}

	@Override
	public String yuan(double quantity) {
		return Double.toString(quantity * 0.73);
	}

}

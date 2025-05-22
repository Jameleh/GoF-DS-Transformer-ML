
public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		return (float) Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		return (float) Math.half(f.doubleValue());
	}
	
	@Override
	public Float doubledOf(Float f) {
		// TODO Auto-generated method stub

		return Math.doubled(f.doubleValue()).floatValue();
	}

}


public class DvarDohar implements DdPlane {

	
	private String dd,m,tm,mc,tb;
	@Override
	public void setTypeDD(String dvardohar) {
		// TODO Auto-generated method stub
		this.dd=dvardohar;
	}

	@Override
	public void setMishloah(String m) {
		// TODO Auto-generated method stub
		this.m=m;
	}

	@Override
	public void setTypeMishloah(String tm) {
		// TODO Auto-generated method stub
		this.tm=tm;
	}

	@Override
	public void setMColor(String mc) {
		// TODO Auto-generated method stub
		this.mc=mc;
	}

	@Override
	public void setTypeBul(String tb) {
		// TODO Auto-generated method stub
		this.tb=tb;
	}

	
	public String toString() {
		
		return "The type of DvarDohar is : "+this.dd+"\n"
				+ "The Mishloah to : "+this.m+"\n"
						+ "The type of Mishloah is :"+this.tm+"\n"
						+ "The color pf Mahatafa is : "+this.mc+"\n"
								+ "The type of bull is :"+this.tb+"\n";
	}
}

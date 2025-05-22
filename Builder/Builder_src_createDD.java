
public class createDD {
	
	private IDdBuilder iddb;
	
	createDD(IDdBuilder iddb){
		this.iddb=iddb;
	}
	
	public DvarDohar getDD() {
		return this.iddb.getDvarDohar();
	}
	
	public void buildDD() {
		
		this.iddb.buildDvarDohar();
	}

}

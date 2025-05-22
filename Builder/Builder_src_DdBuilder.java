import java.util.Scanner;

public class DdBuilder implements IDdBuilder{

	private DvarDohar dd;
	Scanner sc;
	String []str;
	String s;
	
	public DdBuilder() {
		this.dd=new DvarDohar();
		sc=new Scanner(System.in);
		str=new String[5];
		
	}
	@Override
	public void buildDvarDohar() {
		
		System.out.println("Please Enter:\n"
				+ "1. Which type of Dvar Dohar (Havila/Michtav)\n" 
				+ "2. Where to send(Israel/Abord)\n"
				+ "3. Type of Mishloah (regualr/sender/express)\n"
				+ "4. Color of Mahatafa (Brown/White)\n"
				+ "5. Type of bull (regular/picture");
		for(int i=0;i<5;i++) {
			s=sc.nextLine();
			str[i]=s;
		}
		
		this.dd.setTypeDD(str[0]);
		this.dd.setMishloah(str[1]);
		this.dd.setTypeMishloah(str[2]);
		this.dd.setMColor(str[3]);
		this.dd.setTypeBul(str[4]);
	}

	@Override
	public DvarDohar getDvarDohar() {
		// TODO Auto-generated method stub
		return this.dd;
	}

}

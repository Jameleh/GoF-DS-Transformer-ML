package jj.object;

/**
 * 초기화 지연 시키기
 * 
 * @author stevejj
 * @version 1.0
 * 
 * */
public class UserLazy {

	private static UserLazy usr = null;
	
	private UserLazy() {
		System.out.println("## UserLazy.java ## 유저 생성");
	}
	
	public static UserLazy getInstance() {
		if(usr == null) {
			usr = new UserLazy();
		}
		
		return usr;
	}
	
}

package jj.object;

/**
 * Synchronized 를 이용하여 동기화 시키기
 * Volatile 사용하기
 * Synchronized double checking 하기
 * 
 * @author stevejj
 * @version 1.0
 * 
 * */
public class UserSyncVolatile {
	
	private volatile static UserSyncVolatile usr = null;
	
	private UserSyncVolatile() {
		System.out.println("## UserSyncVolatile.java ## 유저 생성");
	}
	
	public static UserSyncVolatile getInstance() {
		if(usr == null) {
			synchronized(UserSyncVolatile.class) {
				if(usr == null) {
					usr = new UserSyncVolatile();
				}
			}
		}
		return usr;
	}
	
}
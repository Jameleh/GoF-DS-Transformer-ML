
public class ProxyTest {

	public static void main(String[] args) {

		//When you click on folder,Lets say a GUI form will ask for userName and password.
		//and this GUI will create this user object
		
		// If we give correct userName and password
		User user=new User("arpit","arpit");
		//FolderProxy folderProxy=new FolderProxy(user);
		
		System.out.println("When userName and password are correct:");
		new FolderProxy(user.getUserName(),user.getPassword());
		
		System.out.println("**************************************");

		// if we give wrong userName and Password
		User userWrong=new User("abc","abc");
		System.out.println("When userName and password are incorrect:");
		new FolderProxy(userWrong.getUserName(),userWrong.getPassword());
		
	}

}





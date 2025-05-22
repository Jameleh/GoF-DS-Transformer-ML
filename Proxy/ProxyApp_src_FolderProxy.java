

public class FolderProxy implements IFolder{

	Folder folder;
	User user;

	public FolderProxy(String userName,String password) {
		user=new User(userName, password);
		performOperations();
	}

	@Override
	public void performOperations() {

		//check if user name = "arpit", then perform operation on the folder
		//else, print statement "you don't have access to this folder"
		if(user.userName.equals("arpit")){
			if(folder==null){
				folder=new Folder();
			}
			folder.performOperations();
		}else
		System.out.println("you don't have access to this folder");
	}
} 



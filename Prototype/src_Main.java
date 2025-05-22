
public class Main {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		System.out.println("Prototype Design pattern");
		NetworkConnection networkConnection1 = new NetworkConnection();
		networkConnection1.setIp("127.0.0.1");
		networkConnection1.loadImportantData();
		
		System.out.println(networkConnection1);

		
		NetworkConnection networkConnection2 = (NetworkConnection)networkConnection1.clone();
		System.out.println(networkConnection2);
		
		NetworkConnection networkConnection3 = (NetworkConnection)networkConnection1.clone();
		System.out.println(networkConnection3);
		networkConnection1.getDomains().remove(0);
		
		System.out.println("***************");
		System.out.println(networkConnection1);
		System.out.println(networkConnection2);
		System.out.println(networkConnection3);
		
	}

}

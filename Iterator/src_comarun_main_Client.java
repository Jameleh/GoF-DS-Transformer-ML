package comarun.main;

public class Client {
	
	public static void main(String args[])
	{
		Product p1=new Product("brush","123");
		Product p2=new Product("brush1","1234");
		Product p3=new Product("brush2","12345");
		Product p4=new Product("brush3","123456");
		
		ArraysList obj=new ArraysList();
		obj.add(p1);
		obj.add(p2);
		obj.add(p3);
		obj.add(p4);
		
		Iterator iterator=obj.createIterator();
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
		
		
	}

}

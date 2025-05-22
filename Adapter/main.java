
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Adapter adapter = new AdapterImpl();
			
			System.out.println(adapter.twiceOf(100f));
			System.out.println(adapter.halfOf(100f));
			System.out.println(adapter.doubledOf(100f));
	}

}

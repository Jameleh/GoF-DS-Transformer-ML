
public class RealSubject implements Subject {

	public RealSubject() {
		System.out.println("Object created.");
	}

	@Override
	public void process() {
		System.out.println("processing complete.");
	}

}

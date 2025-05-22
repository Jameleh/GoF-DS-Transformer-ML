public class Proxy implements RealObject {
    private RealObjectImpl realObject;

    @Override
    public void request() {
        // Create the real object only when necessary
        if (realObject == null) {
            realObject = new RealObjectImpl();
        }
        // Additional logic can be added here before or after calling the real object
        System.out.println("Proxy handling request");
        realObject.request();
    }
}

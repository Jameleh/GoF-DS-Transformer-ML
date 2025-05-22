
public class Proxy implements Subject {
    private static Subject object;

    @Override
    public void process() {
        if (object == null) {
            object = new RealSubject();
        }
        object.process();
    }
}

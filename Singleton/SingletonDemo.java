
public class SingletonDemo {
    public static void main(String[] args) throws Exception {
        Singleton service = Singleton.getInstance();
        service.doSomething();
    }
}

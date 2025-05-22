
public class SoloSingleton {
    private static Solo2 instance_;
    private static Object syncObject_ = new Object();
    private SoloSingleton() {
        super();
    }
    public static void set(Solo2 s) {
        synchronized (syncObject_) {
            instance_ = s;
        }
    }
    public static Solo2 get() {
        synchronized (syncObject_) {
            return instance_;
        }
    }
    public static void release() {
        synchronized (syncObject_) {
            instance_ = null;
        }
    }
}

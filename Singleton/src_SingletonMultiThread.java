public final class SingletonMultiThread {

    private static volatile SingletonMultiThread instance;

    public String value;

    private SingletonMultiThread(String value) {
        this.value = value;
    }

    public static SingletonMultiThread getInstance(String value) {
        SingletonMultiThread result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SingletonMultiThread.class) {
            if (instance == null) {
                instance = new SingletonMultiThread(value);
            }
            return instance;
        }
    }

}

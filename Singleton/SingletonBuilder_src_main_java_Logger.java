public class Logger {

    private static Logger logger = null;
    private int index = 0;


    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + new java.util.Date() + " " + index + "] " + msg);

        index++;
    }
}

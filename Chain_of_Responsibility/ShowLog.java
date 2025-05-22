import java.util.logging.Handler;

/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class ShowLog { /* Client */
    public static void main(String[] args) {
        HandleLog error = new ErrorLog();
        HandleLog file = new FileLog();
        HandleLog console = new ConsoleLog();

        error.setTypeLog(file);
        file.setTypeLog(console);

        error.processLog("INFO", "This is an information.");
        System.out.println("-----------------------------------------------------");
        error.processLog("DEBUG", "This is a debug information.");
        System.out.println("-----------------------------------------------------");
        error.processLog("ERROR", "This is an error information.");
    }
}

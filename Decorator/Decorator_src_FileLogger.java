import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private final Logger wrapped;
    private final String fileName;

    public FileLogger(Logger wrapped, String fileName) {
        this.wrapped = wrapped;
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        wrapped.log(message);
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

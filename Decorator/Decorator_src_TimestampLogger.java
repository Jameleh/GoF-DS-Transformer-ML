import java.time.LocalDateTime;

public class TimestampLogger implements Logger {
    private final Logger wrapped;

    public TimestampLogger(Logger wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void log(String message) {
        String timestampedMessage = "[" + LocalDateTime.now() + "] " + message;
        wrapped.log(timestampedMessage);
    }
}

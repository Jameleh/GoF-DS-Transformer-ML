public class JsonFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "{ \"log\": \"" + message + "\" }";
    }
}
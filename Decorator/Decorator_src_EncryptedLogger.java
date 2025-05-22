public class EncryptedLogger implements Logger {
    private final Logger wrapped;

    public EncryptedLogger(Logger wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void log(String message) {
        String encryptedMessage = new StringBuilder(message).reverse().toString(); // Simples encriptação
        wrapped.log(encryptedMessage);
    }
}

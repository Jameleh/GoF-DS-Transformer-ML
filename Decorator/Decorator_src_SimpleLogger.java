public class SimpleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message); // Registro no console
    }
}

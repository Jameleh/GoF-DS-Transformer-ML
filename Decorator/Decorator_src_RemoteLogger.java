class RemoteLogger implements Logger {
    private final Logger wrapped;

    public RemoteLogger(Logger wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void log(String message) {
        wrapped.log(message);
        // Simulação de envio ao servidor remoto
        System.out.println("Mensagem enviada ao servidor remoto: " + message);
    }
}
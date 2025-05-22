public class Main {
    public static void main(String[] args) {
        // Logger base
        Logger simpleLogger = new SimpleLogger();

        // Logger com hora
        Logger timestampLogger = new TimestampLogger(simpleLogger);
        timestampLogger.log("Mensagem com hora: Olá, esta é uma mensagem com hora.");

        // Logger com criptografia
        Logger encryptedLogger = new EncryptedLogger(simpleLogger);
        encryptedLogger.log("Mensagem criptografada: Olá, esta é uma mensagem secreta.");

        // Logger para console
        simpleLogger.log("Mensagem enviada ao console: Mensagem para o console.");

        // Logger para arquivo
        Logger fileLogger = new FileLogger(simpleLogger, "mensagem.txt");
        fileLogger.log("Mensagem salva no arquivo: mensagem.txt");

        // Logger para servidor remoto
        Logger remoteLogger = new RemoteLogger(simpleLogger);
        remoteLogger.log("Mensagem enviada ao servidor remoto: Mensagem para o servidor remoto.");
    }
}
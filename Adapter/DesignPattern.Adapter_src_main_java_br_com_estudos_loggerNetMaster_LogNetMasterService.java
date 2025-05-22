package br.com.estudos.loggerNetMaster;

// Adapter class
public class LogNetMasterService implements ILogNetMaster {
    public void logInfo(String message) {
        System.out.println("Log Customizado - " + message);
    }

    public void logException(Exception exception) {
        System.out.println("Log Customizado - " + exception.getMessage());
    }
}
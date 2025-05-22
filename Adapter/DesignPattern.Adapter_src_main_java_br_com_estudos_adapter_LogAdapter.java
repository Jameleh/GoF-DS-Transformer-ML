package br.com.estudos.adapter;

import br.com.estudos.logger.ILogger;
import br.com.estudos.loggerNetMaster.ILogNetMaster;

// Adapter class
public class LogAdapter implements ILogger {

    private ILogNetMaster logNetMaster;

    public LogAdapter(ILogNetMaster logNetMaster) {
        this.logNetMaster = logNetMaster;
    }

    @Override
    public void log(String message) {
        this.logNetMaster.logInfo(message);

    }

    @Override
    public void logError(Exception exception) {
        this.logNetMaster.logException(exception);

    }

}

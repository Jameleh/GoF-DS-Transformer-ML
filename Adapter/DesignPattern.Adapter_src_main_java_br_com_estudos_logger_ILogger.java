package br.com.estudos.logger;

public interface ILogger {

    void log(String message);

    void logError(Exception exception);
}
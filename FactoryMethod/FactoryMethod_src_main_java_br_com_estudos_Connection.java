package br.com.estudos;


public class Connection {
    public String connectionString;
    public Boolean opened;
   
    
    public Connection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void executeCommand(String command) {
        System.out.println("Executando Commando: " + command);
    }

    public void open() {
        opened = true;
        System.out.println("ConexÒo aberta");
    }

    public void close() {
        System.out.println("ConexÒo fechada");
    }
}
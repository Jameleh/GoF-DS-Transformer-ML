package br.com.estudos.oracle;

import br.com.estudos.Connection;
import br.com.estudos.db.DbConnector;

// Concrete Product
public class OracleDbConnector extends DbConnector {

    public OracleDbConnector(String connectionString) {
        super(connectionString);
    }

    @Override
    public Connection connect() {
        System.out.println("Conectando ao banco Oracle...");
        var connection = new Connection(connectionString);
        connection.open();

        return connection;
    }
}
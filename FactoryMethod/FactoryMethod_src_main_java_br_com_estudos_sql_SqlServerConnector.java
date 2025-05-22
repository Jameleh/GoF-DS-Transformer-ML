package br.com.estudos.sql;

import br.com.estudos.Connection;
import br.com.estudos.db.DbConnector;

// Concrete Product
public class SqlServerConnector extends DbConnector {

    public SqlServerConnector(String connectionString) {
        super(connectionString);
    }

    @Override
    public Connection connect() {
        System.out.println("Conectando ao banco SQL Server...");
        var connection = new Connection(connectionString);
        connection.open();

        return connection;
    }
}

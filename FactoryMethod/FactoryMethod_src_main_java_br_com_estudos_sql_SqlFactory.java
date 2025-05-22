package br.com.estudos.sql;

import br.com.estudos.db.DbConnector;
import br.com.estudos.db.DbFactory;

// Concrete Creator
public class SqlFactory extends DbFactory {
    // Factory Method
    @Override
    public DbConnector createConnector(String connectionString) {
        return new SqlServerConnector(connectionString);
    }
}

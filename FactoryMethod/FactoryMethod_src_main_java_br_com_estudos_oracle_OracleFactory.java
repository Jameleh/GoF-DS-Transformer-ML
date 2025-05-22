package br.com.estudos.oracle;

import br.com.estudos.db.DbConnector;
import br.com.estudos.db.DbFactory;

// Concrete Creator
public class OracleFactory extends DbFactory {
    // Factory Method
    @Override
    public DbConnector createConnector(String connectionString) {
        return new OracleDbConnector(connectionString);
    }
}
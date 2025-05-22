package br.com.estudos.db;

import br.com.estudos.DataBase;
import br.com.estudos.oracle.OracleFactory;
import br.com.estudos.sql.SqlFactory;

// Abstract Creator
public abstract class DbFactory {
    // Factory Method
    public abstract DbConnector createConnector(String connectionString);

    public static DbFactory database(DataBase dataBase) throws Exception {
        if (dataBase == DataBase.SqlServer)
            return new SqlFactory();
        if (dataBase == DataBase.Oracle)
            return new OracleFactory();

        throw new Exception("Banco de dados năo reconhecido.");
    }
}
package br.com.estudos.db;

import br.com.estudos.Connection;

public abstract class DbConnector {
    protected DbConnector(String connectionString) {
        this.connectionString = connectionString;
    }

    protected String connectionString;

    public abstract Connection connect();
}

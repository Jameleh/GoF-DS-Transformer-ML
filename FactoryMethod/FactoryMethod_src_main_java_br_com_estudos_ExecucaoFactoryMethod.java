package br.com.estudos;

import br.com.estudos.db.DbFactory;

public class ExecucaoFactoryMethod {
    public static void executar() throws Exception {
        var sqlCn = DbFactory.database(DataBase.SqlServer)
                             .createConnector("minhaCS")
                             .connect();

        sqlCn.executeCommand("select * from tabelaSql");
        sqlCn.close();

        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");

        var oracleCn = DbFactory.database(DataBase.Oracle)
                                .createConnector("minhaCS")
                                .connect();

        oracleCn.executeCommand("select * from tabelaOracle");
        oracleCn.close();
    }
}
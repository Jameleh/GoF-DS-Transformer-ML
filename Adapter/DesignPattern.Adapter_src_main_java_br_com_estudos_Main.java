package br.com.estudos;

import br.com.estudos.adapter.LogAdapter;
import br.com.estudos.logger.Logger;
import br.com.estudos.loggerNetMaster.LogNetMasterService;

public class Main {

    public static void main(String[] args) {

        var pagamentoLogPadrao = new TransacaoService(new Logger());
        pagamentoLogPadrao.realizarTransacao();

        var pagamentoLogCustom = new TransacaoService(new LogAdapter(new LogNetMasterService()));
        pagamentoLogCustom.realizarTransacao();
    }

}

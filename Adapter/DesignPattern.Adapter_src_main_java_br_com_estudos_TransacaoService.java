package br.com.estudos;

import br.com.estudos.logger.ILogger;

public class TransacaoService {

    private ILogger logger;

    public TransacaoService(ILogger logger) {
        this.logger = logger;
    }

    public void realizarTransacao() {
        // TransaÓÐo
        logger.log("TransaÓÐo realizada");
    }
}

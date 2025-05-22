package com.mycompany.bridge;

public class MensagemSimples extends Mensagem {

    public MensagemSimples(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void EnviarMensagem(String texto) {
        canal.enviar("Enviar mensagem simples" + texto);
        
    }
    
}

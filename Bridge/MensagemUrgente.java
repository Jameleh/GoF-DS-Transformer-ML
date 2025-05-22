package com.mycompany.bridge;

public class MensagemUrgente extends Mensagem{

    public MensagemUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void EnviarMensagem(String texto) {
        canal.enviar("Enviando mensagem urgente" + texto);
    }
    
    
}

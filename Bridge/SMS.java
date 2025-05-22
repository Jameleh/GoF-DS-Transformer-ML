package com.mycompany.bridge;

public class SMS implements CanalEnvio {

    @Override
    public void enviar(String texto) {
        System.out.println("Enviando uma mensagem de texto" + texto);
    }
    
}

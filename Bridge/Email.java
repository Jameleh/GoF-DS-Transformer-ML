package com.mycompany.bridge;

public class Email implements CanalEnvio {

    @Override
    public void enviar(String texto) {
        System.out.println("Enviando um email" + texto);
    }
    
}

package com.mycompany.bridge;

public class Bridge {

    public static void main(String[] args) {
        CanalEnvio email = new Email();
        CanalEnvio SMS = new SMS();
        
        Mensagem msg1 = new MensagemSimples(email);
        Mensagem msg2 = new MensagemUrgente(SMS);
        
        System.out.println(msg1);
        System.out.println(msg2);
    }
}

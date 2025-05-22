package org.example;

public class ChatUser extends User {

    public ChatUser(ChatMediator med,String name) {
        super(med, name);
    }

    public void send(String msg){
        System.out.println(this.name+": Enviando Mensagem= "+msg);
        mediator.sendMessage(msg, this);
    }
    public void receive(String msg) {
        System.out.println(this.name+": Mensagem recebida: "+msg);
    }
}

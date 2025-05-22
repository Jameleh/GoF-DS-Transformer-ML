package org.example;

/*
Neste exemplo, criamos uma interface ChatMediator que
define as operações que o Mediator deve suportar:
enviar mensagem e adicionar usuário.
 */

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

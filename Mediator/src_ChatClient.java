/*
* Aplicação de chat com um programa simples
* onde cria o mediador e adiciona usuários ao grupo
* um dos usuários enviará uma mensagem.
*
* */
public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Mariana");
        User user2 = new UserImpl(mediator, "Katia");
        User user3 = new UserImpl(mediator, "Naira");
        User user4 = new UserImpl(mediator, "Joao");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user3.send("Hi All");

    }
}

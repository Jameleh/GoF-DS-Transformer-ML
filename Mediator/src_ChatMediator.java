/*
*A interface do Mediator define a organização
* para os mediadores concretos.
* */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
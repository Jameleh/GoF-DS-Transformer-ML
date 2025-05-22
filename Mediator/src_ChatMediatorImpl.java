/*
* Cria uma classe de mediador concreta,
* ela terá uma lista de usuários no grupo
* e fornecerá lógica para a comunicação entre os usuários.
*
* */
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }
}

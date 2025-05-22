package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String message, User user) {
        for(User u : this.users){
            if(u != user){
                u.receive(message);
            }
        }
    }
}

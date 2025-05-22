import Visitable.AnimalVisitable;
import Visitable.Chat;
import Visitable.Chien;
import Visitor.ChatCommunique;
import Visitor.ChienCommunique;

public class App {
    public static void main(String[] args) throws Exception {
        
        ChatCommunique chatCommunique = new ChatCommunique();
        ChienCommunique chienCommunique = new ChienCommunique();

        AnimalVisitable chien = new Chien();
        AnimalVisitable chat = new Chat();


        System.out.println(chien.communique()); // aboie
        System.out.println(chat.communique()); // miaule

        System.out.println(chien.accept(chienCommunique)); // CHIEN communique avec un Chien
        System.out.println(chat.accept(chienCommunique)); // CHIEN communique avec un Chat

        System.out.println(chien.accept(chatCommunique)); // CHAT communique avec un Chien
        System.out.println(chat.accept(chatCommunique)); // CHAT communique avec un Chat

    }
}

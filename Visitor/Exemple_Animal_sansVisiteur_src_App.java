import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Animal chien = new Chien();
        Animal chat = new Chat();

        chien.communiquer(); // Aboyer
        chat.communiquer(); // Miaule

        System.out.println(chat.getClass().getSimpleName()); // Chat
        System.out.println(chien.getClass().getSimpleName()); // Chien

        // La variable chat a pour type statique Animal et pour type dynamique Chat
        // Le compilateur pense que chat est de type Animal. Le vrai type, qui est Chat, 
        // est déduit à l'exécution du programme. >> polymorphisme >> single dispatch


        // En Java, l’invocation d’une méthode est associée au corps de la bonne 
        // version de la méthode dynamiquement, à l’exécution (« late binding »)
        
        // En Java, le compilateur n’a aucune façon de savoir quelle version de la
        // méthode doit être invoquée. Il faut attendre à l’exécution pour le savoir.


        chien.communiquer(chat); // <<<<<< IT FAILS HERE
        // chat.communiquer(chat);
        // This is where Double dispatch fail because we cannot polymorphically resolve at run time the
        // actual concrete class that's passed in. This is what the Visitor Design Pattern is going to fix.

    }
}

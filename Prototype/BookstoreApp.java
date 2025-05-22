package PrototypeDesignPattern;

public class BookstoreApp {
    public static void main(String[] args){
        BookRegistry bookRegistry=new BookRegistry();
        Educational educational=(Educational) bookRegistry.getBook(BookType.EDUCATIONAL);
        System.out.println(educational);

        educational.setType("Undergraduate Books");
        System.out.println(educational);

        Educational educational2=(Educational)bookRegistry.getBook(BookType.EDUCATIONAL);
        System.out.println(educational2);
    }
}

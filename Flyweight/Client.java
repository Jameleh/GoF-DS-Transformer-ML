public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        String document = "Hello World";
        String[] formatting = {"bold", "italic", "underline"};

        for (int i = 0; i < document.length(); i++) {
            char c = document.charAt(i);
            Flyweight flyweight = factory.getFlyweight(c);
            flyweight.render(formatting[i % formatting.length]);
        }
    }
}

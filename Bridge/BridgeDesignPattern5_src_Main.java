public class Main {
    public static void main(String[] args) {
        IMessageSender email = new EMailMessageSender();
        IMessageSender text = new TextMessageSender();

        Message emailMessage = new EMailMessage();
        Message textMessage = new TextMessage();

        emailMessage.send(email);
        textMessage.send(text);
    }
}
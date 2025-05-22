public class TextMessageSender implements IMessageSender{//concrete element
    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }

}

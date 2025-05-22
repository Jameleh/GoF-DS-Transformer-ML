public class TextMessage extends Message{
    @Override
    public void send(IMessageSender message) {
        message.sendMessage();
    }
}

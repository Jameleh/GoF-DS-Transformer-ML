public class EMailMessage extends Message{

    /*
    public EMailMessage(IMessageSender message) {
        super(message);
    }

    @Override
    public void send() {
        message.sendMessage(this);
    }
     */

    @Override
    public void send(IMessageSender message) {
        message.sendMessage();
    }
}

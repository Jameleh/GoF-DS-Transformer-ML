public abstract class Message {

    //private IMessageSender message;

   /* public Message(IMessageSender message) {
        this.message = message;
    }*/
    public abstract void send(IMessageSender message);
}

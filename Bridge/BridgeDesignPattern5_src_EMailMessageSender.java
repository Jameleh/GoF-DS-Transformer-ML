public class EMailMessageSender implements IMessageSender{ //concrete element
    @Override
    public void sendMessage() {
        System.out.println("EMailMessageSender: Sending email message...");
    }
}

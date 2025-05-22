import java.util.Base64;
// ConcreteDecorator
public class EncodeMessagerieDecorator extends MessagerieDecorator {

    public EncodeMessagerieDecorator(IMessagerie messagerie) {
        super(messagerie);
    }

    @Override
    public int getDestinataire() {
        return messagerie.getDestinataire();
    }

    @Override
    public int getExpediteur() {
        return messagerie.getExpediteur();
    }

    @Override
    public String getMessage() {
        return Base64.getEncoder().encodeToString(messagerie.getMessage().getBytes());
    }
}

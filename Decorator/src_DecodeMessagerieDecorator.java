import java.util.Base64;
// ConcreteDecorator
public class DecodeMessagerieDecorator extends MessagerieDecorator {
    public DecodeMessagerieDecorator(IMessagerie messagerie) {
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
        return new String(Base64.getDecoder().decode(messagerie.getMessage()));
    }
}

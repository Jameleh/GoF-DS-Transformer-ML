// Decorator
public class MessagerieDecorator implements IMessagerie {
    protected IMessagerie messagerie;

    public MessagerieDecorator(IMessagerie messagerie) {
        this.messagerie = messagerie;
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
        return messagerie.getMessage();
    }
}

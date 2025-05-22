import java.time.LocalDateTime;

public class DocumentProxy implements DocumentResource {
    private final Document realDocument;
    private final AccessControlService accessService = AccessControlService.getInstance();

    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
    }

    @Override
    public String getId() {
        return realDocument.getId();
    }

    @Override
    public LocalDateTime getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessService.isAllowed(user.getUsername(), realDocument.getId())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}

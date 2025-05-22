import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

public class Library {
    private final Map<String, DocumentResource> documents = new HashMap<>();

    public void addUnprotectedDocument(String id, String content) {
        documents.put(id, new Document(id, LocalDateTime.now(), content));
    }

    public void addProtectedDocument(String id, String content) {
        Document real = new Document(id, LocalDateTime.now(), content);
        documents.put(id, new DocumentProxy(real));
    }

    public DocumentResource getDocument(String id) {
        return documents.get(id);
    }
}

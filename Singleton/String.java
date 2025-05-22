public class Email {
    private String sender;
    private String recipient;
    private String body;
    private List<String> attachments;
    private Email(Builder builder) {
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }
    public static class Builder {
        private String sender;
        private String recipient;
        private String body;
        private List<String> attachments = new ArrayList<>();
        public Builder(String sender, String recipient) {
            this.sender = sender;
            this.recipient = recipient;
        }
        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public Builder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }
        public Email build() {
            return new Email(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Email email = new Email.Builder("sender@example.com", "recipient@example.com")
                .body("This is the email body.")
                .addAttachment("document.pdf")
                .addAttachment("image.jpg")
                .build();
    }
}

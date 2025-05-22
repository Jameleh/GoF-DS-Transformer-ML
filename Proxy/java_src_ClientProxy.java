import java.util.List;

public class ClientProxy implements IClient {

    private Client client;

    private Integer accountId;

    public ClientProxy(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public List<String> getData() {
        if (this.client == null) {
            this.client = new Client(this.accountId);
        }
        return this.client.getData();
    }

    @Override
    public Float getBalance(Manager manager) {
        if (!manager.isAdmin()) {
            throw new IllegalArgumentException("This manager dont have access to this account");
        }
        if (this.client == null) {
            this.client = new Client(this.accountId);
        }
        return this.client.getBalance(manager);
    }
}

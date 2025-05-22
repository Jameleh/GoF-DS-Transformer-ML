
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClientProxyTest {

    @BeforeEach
    void setUp() {
        Bank.addClient(new Client(1, "Lucas", 100.0f));
        Bank.addClient(new Client(2, "Pedro", 20.0f));
        Bank.addClient(new Client(3, "Silva", 30.0f));
        Bank.addClient(new Client(4, "Lula", 13.0f));
    }

    @Test
    void shouldReturnClientData() {
        ClientProxy client = new ClientProxy(1);
        assertEquals(Arrays.asList("Lucas", "1"), client.getData());
    }

    @Test
    void shouldReturnClientBalance() {
        Manager manager = new Manager("Bia", true);
        ClientProxy client = new ClientProxy(2);
        assertEquals(20.0f, client.getBalance(manager));
    }

    @Test
    void shouldReturnManagerDontHaveAccessToAccountException() {
        try {
            Manager manager = new Manager("Gabriel", false);
            ClientProxy client = new ClientProxy(2);
            client.getBalance(manager);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("This manager dont have access to this account", e.getMessage());
        }
    }

    @Test
    void shouldReturnManagerHaveAccessToAccountBalance() {
            Manager manager = new Manager("Lula", true);
            ClientProxy client = new ClientProxy(4);
            client.getBalance(manager);
            assertEquals(13f, client.getBalance(manager));
    }
}
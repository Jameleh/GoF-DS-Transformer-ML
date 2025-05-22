package observerTest;

import observer.Cliente;
import observer.Oferta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTeste {
    @Test
    void deveNotificarUmCliente() {
        Oferta oferta = new Oferta("Iphone 13", 4600.00, "Lojas Americanas");
        Cliente cliente = new Cliente("Creitin");
        cliente.adicionarOferta(oferta);
        oferta.atualizarOferta(3200.00);
        assertEquals("Creitin, preco atualizado em Oferta{nomeProduto=Iphone 13, preco=3200.0, loja=Lojas Americanas}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Oferta oferta = new Oferta("Iphone 13", 4600.00, "Lojas Americanas");
        Cliente cliente1 = new Cliente("Creitin");
        Cliente cliente2 = new Cliente("Plaudio");
        cliente1.adicionarOferta(oferta);
        cliente2.adicionarOferta(oferta);
        oferta.atualizarOferta(3200.00);
        assertEquals("Creitin, preco atualizado em Oferta{nomeProduto=Iphone 13, preco=3200.0, loja=Lojas Americanas}", cliente1.getUltimaNotificacao());
        assertEquals("Plaudio, preco atualizado em Oferta{nomeProduto=Iphone 13, preco=3200.0, loja=Lojas Americanas}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Oferta oferta = new Oferta("Iphone 13", 4600.00, "Lojas Americanas");
        Cliente cliente1 = new Cliente("Creitin");
        oferta.atualizarOferta(3200.00);
        assertEquals(null, cliente1.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClientePrecoMaisAltoQueAnterior() {
        Oferta oferta = new Oferta("Iphone 13", 4600.00, "Lojas Americanas");
        Cliente cliente1 = new Cliente("Creitin");
        cliente1.adicionarOferta(oferta);
        oferta.atualizarOferta(5000.00);
        assertEquals(null, cliente1.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteOfertaA() {
        Oferta ofertaA = new Oferta("A", 5000.00, "Lojas Americanas");
        Oferta ofertaB = new Oferta("B", 4600.00, "Lojas Americanas");
        Cliente cliente1 = new Cliente("Creitin");
        Cliente cliente2 = new Cliente("Plaudio");
        cliente1.adicionarOferta(ofertaA);
        cliente2.adicionarOferta(ofertaB);
        ofertaA.atualizarOferta(3200.00);
        assertEquals("Creitin, preco atualizado em Oferta{nomeProduto=A, preco=3200.0, loja=Lojas Americanas}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}
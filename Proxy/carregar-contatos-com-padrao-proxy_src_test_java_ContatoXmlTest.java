import com.algaworks.contatos.ContatosXML;
import com.algaworks.repository.Contatos;
import org.junit.Assert;
import org.junit.Test;

public class ContatoXmlTest {

    @Test
    public void deveRetornarContanto(){
        Contatos contatos = new ContatosXML("contatos1.xml", "contatos2.xml");
        String nome = contatos.buscarPor("jose@email.com");

        Assert.assertEquals("José Santos", nome);
    }
}

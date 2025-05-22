package facade;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Ygor
 */
public class NotaFiscal {
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    
    public void gerandoNota(){
        System.out.println("Gerando Nota fiscal para o produto na data é hora: " + formatador.format(data));
    }
}

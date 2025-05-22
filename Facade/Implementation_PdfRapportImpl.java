package Implementation;

import java.sql.Connection;
 
import Facade.PdfRapport;

public class PdfRapportImpl implements PdfRapport {
 
	public void genererPdf (Connection connection, String tableName) {
		System.out.println("Generer rapport PDF...");
	}
}

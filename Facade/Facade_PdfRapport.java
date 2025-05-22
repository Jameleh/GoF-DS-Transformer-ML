package Facade;

import java.sql.Connection;

public interface PdfRapport {
 
	public abstract void genererPdf(Connection connection,String uneTable);
}

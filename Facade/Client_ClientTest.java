package Client;

import java.sql.Connection;
import Facade.ExcelRapport;
import Facade.HtmlRapport;
import Facade.PdfRapport;
import Implementation.ExcelRapportImpl;
import Implementation.HtmlRapportImpl;
import Implementation.PdfRapportImpl;
import Implementation.RapportFacade;
 
public class ClientTest {
 
	public static void main(String[] args) {
		
		Connection connection = null;
		String uneTable = "Ma_Table";
		
		System.out.println("----------- Sans utiliser le pattern Facade  ------------------");

		//Sans utiliser le pattern Facade 
		PdfRapport pdfRapport = new PdfRapportImpl();
		pdfRapport.genererPdf(connection, uneTable);
		
		HtmlRapport htmlRapport = new HtmlRapportImpl();
		htmlRapport.genererHtml(connection, uneTable);
		
		ExcelRapport excelRapport = new ExcelRapportImpl();
		excelRapport.genererExcel(connection, uneTable);
        
        System.out.println("----------------------------------------------------------------------");

        System.out.println("----------- En utilisant le pattern Facade  ------------------");
		
		//Avec le pattern Facade 
		RapportFacade RapportFacade = new RapportFacade();
		RapportFacade.genererPdf(connection, uneTable);
		RapportFacade.genererHtml(connection, uneTable);
		RapportFacade.genererExcel(connection, uneTable);
	}
 
}

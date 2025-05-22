package Implementation;

import java.sql.Connection;
 
import Facade.ExcelRapport;

public class ExcelRapportImpl implements ExcelRapport {
 
	public void genererExcel(Connection connection, String uneTable) {
		System.out.println("Generer rapport EXCEL...");
	}
}

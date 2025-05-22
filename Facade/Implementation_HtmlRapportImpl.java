package Implementation;

import java.sql.Connection;
 
import Facade.HtmlRapport;

public class HtmlRapportImpl implements HtmlRapport {
 
	public void genererHtml(Connection connection, String uneTable) {
		System.out.println("Generer rapport HTML...");
	}
 
}

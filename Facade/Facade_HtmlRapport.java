package Facade;

import java.sql.Connection;

public interface HtmlRapport {
 
	public abstract void genererHtml(Connection connection,String uneTable);
}

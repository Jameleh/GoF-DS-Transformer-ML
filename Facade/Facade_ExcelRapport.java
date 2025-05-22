package Facade;
import java.sql.Connection;

public interface ExcelRapport {

	public abstract void genererExcel(Connection connection,String uneTable);
}

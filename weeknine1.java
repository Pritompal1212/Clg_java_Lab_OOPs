
import java.sql.*;
public class weeknine1
{
public static void main(String s[])
{
try
{  
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection c=DriverManager.getConnection("jdbc:odbc:connect_ora","scott","tiger");
     DatabaseMetaData dm=c.getMetaData();
     System.out.println("Data Base Name :"+dm.getDatabaseProductName());
     System.out.println("Versio         :"+dm.getDatabaseProductVersion());
     System.out.println("User Name      :"+dm.getUserName());
     System.out.println("Driver name    :"+dm.getDriverName());
     System.out.println("Driver Version    :"+dm.getDriverVersion());
}
    catch(Exception e)
    {
          System.out.println(e);
    }
}
}
 

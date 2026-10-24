import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLServer {
    private Connection c;
    
    public GenericDaoSQLServer() {
        super();
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "master";
        String user = "sa";
        String password = ""; // Removida por questao de seguranca
        
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        c = DriverManager.getConnection(String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s", hostName, dbName,user, password));
        
        return c;
    }
}

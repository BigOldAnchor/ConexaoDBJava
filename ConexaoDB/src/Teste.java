import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        GenericDaoSQLServer gDaoSQLServer = new GenericDaoSQLServer();
        
        try {
            Connection c = gDaoSQLServer.getConnection();
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.err.println(sgbd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

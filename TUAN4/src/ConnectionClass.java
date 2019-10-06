import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public Connection connection;
    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection("jdbc:sqlserver://localhost\\HUYEN1234;database=BTTuan4","sa","123");
        }
        catch (Exception ex){
            // ex.printStackTrace();
            System.out.println("Kết Nối Thất Bại");
        }
        return connection;


    }
}

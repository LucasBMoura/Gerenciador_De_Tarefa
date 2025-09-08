import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/lista_java";
    private static final String USER = "Root";
    private static final String PASSWORD = "Root123!";


    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (Exception e) {
            System.out.println("Erro de Conexão: " + e.getMessage());
            return null;
        }
    }
}



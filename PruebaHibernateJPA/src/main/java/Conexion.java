import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/tienda";
    private static final String USER = "root";
    private static final String PASSWORD = "2108";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return null;
        }
    }
}

public class TestConexion {
    public static void main(String[] args) {
        if (Conexion.getConexion() != null) {
            System.out.println("¡Conexión exitosa!");
        } else {
            System.out.println("No se pudo conectar.");
        }
    }
}

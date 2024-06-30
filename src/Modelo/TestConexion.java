package Modelo;

public class TestConexion {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        if (conexion.getConnection() != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }
}

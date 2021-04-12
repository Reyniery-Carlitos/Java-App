package Ejercicio1;

public class Cliente extends BusinessInformation{
    public String direccion;
    public String fechaNacimiento;

    public Cliente(String id, String nombre, String usuarioBaseDatos, String contraseniaBaseDatos, String nombreBaseDatos, String urlBasedatos, String fechaNacimiento, String direccion) {
        super(id, nombre, usuarioBaseDatos, contraseniaBaseDatos, nombreBaseDatos, urlBasedatos);
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void Crear() {
        System.out.println("METODO CREAR EN CLIENTE");
    }

    @Override
    public void Obtener() {
        System.out.println("METODO OBTENER EN CLIENTE");
    }

    @Override
    public void Actualizar() {
        System.out.println("METODO ACTUALIZAR EN CLIENTE");
    }

    @Override
    public void Eliminar() {
        System.out.println("METODO ELIMINAR EN CLIENTE");
    }
}

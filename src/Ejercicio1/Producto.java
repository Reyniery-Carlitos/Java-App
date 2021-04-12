
package Ejercicio1;

public class Producto extends BusinessInformation{
    int cantidad;
    String fechaCreacion;
    String fechaVencimiento;

    public Producto(String id, String nombre, String usuarioBaseDatos, String contraseniaBaseDatos, String nombreBaseDatos, String urlBasedatos, int cantidad, String fechaCreacion, String fechaVencimiento) {
        super(id, nombre, usuarioBaseDatos, contraseniaBaseDatos, nombreBaseDatos, urlBasedatos);
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void Crear() {
        System.out.println("METODO CREAR EN PRODUCTO");
    }

    @Override
    public void Obtener() {
        System.out.println("METODO OBTENER EN PRODUCTO");
    }

    @Override
    public void Actualizar() {
        System.out.println("METODO ACTUALIZAR EN PRODUCTO");
    }

    @Override
    public void Eliminar() {
        System.out.println("METODO ELIMINAR EN PRODUCTO");
    }
}


package Ejercicio1;

public abstract class BusinessInformation {
    public String id;
    public String nombre;
    public String usuarioBaseDatos;
    public String contraseniaBaseDatos;
    public String nombreBaseDatos;
    public String urlBasedatos;

    public BusinessInformation(String id, String nombre, String usuarioBaseDatos, String contraseniaBaseDatos, String nombreBaseDatos, String urlBasedatos) {
        this.id = id;
        this.nombre = nombre;
        this.usuarioBaseDatos = usuarioBaseDatos;
        this.contraseniaBaseDatos = contraseniaBaseDatos;
        this.nombreBaseDatos = nombreBaseDatos;
        this.urlBasedatos = urlBasedatos;
    }

    public abstract void Crear();
    public abstract void Obtener();
    public abstract void Actualizar();
    public abstract void Eliminar();
}


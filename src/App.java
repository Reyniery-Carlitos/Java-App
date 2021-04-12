import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;

public class App{
    public static void main(String[] args){
        // EJERCICIO #1

        // Creando y mostrando metodos del producto 1
        Producto p1 = new Producto("1111", "Prodcuto 1", "Carlos Rubio", "noloserick", "Business Information", "htttp://www.google.com", 25, "23-01-2020", "30-03-2021");
        p1.Crear();
        p1.Obtener();
        p1.Actualizar();
        p1.Eliminar();

        System.out.println("------------------------");
        System.out.println("---------------> EJERCICIO 1 <--------------");
        // Creando y mostrando metodos del cliente 1
        Cliente c1 = new Cliente("080119990000", "Carlos Rubio", "Carlos Rubio", "carlosxD", "Business Information", "https://google.com", "05-06-1995", "Colonia Ulloa");
        c1.Crear();
        c1.Obtener();
        c1.Actualizar();
        c1.Eliminar();

        // EJERCICIO #2
        System.out.println("<======================================>");
        System.out.println("---------------> EJERCICIO 2 <--------------");
        StringManagement trama1 = new StringManagement(20);
        trama1.setTrama("Carlos R092833847382");
        System.out.println(trama1.getTrama());

        // EJERCICIO #3
        System.out.println("<======================================>");
        System.out.println("---------------> EJERCICIO 3 <--------------");
        ValidarTarjeta t1 = new ValidarTarjeta("029343257***453");
        t1.Validar();

        ValidarTarjeta t2 = new ValidarTarjeta("12345678909876654");
        t2.Validar();

        ValidarTarjeta t3 = new ValidarTarjeta("123456789012345");
        t3.Validar();
    }
}

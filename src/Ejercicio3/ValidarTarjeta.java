package Ejercicio3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarTarjeta {
    String tarjeta;

    public ValidarTarjeta(String tarjeta){
        this.tarjeta = tarjeta;
    }

    // Metodo para validar la tarjeta
    public void Validar(){
        if (tarjeta.length() > 16){
            System.out.println("WARNING: Cantidad de valores excede el limite de largo");
        } else{
            Pattern patron = Pattern.compile("\\*");
            Matcher mat = patron.matcher(tarjeta);
            if (mat.find()){
                System.out.println("NUMERO DE TARJETA ENMASCARADA");
            } else{
                System.out.println("NUMERO DE TARJETA NO ENMASCARADA");
            }
        }
    };
}
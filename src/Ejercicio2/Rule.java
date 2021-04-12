package Ejercicio2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rule extends StringManagement{
    int positionInitial;
    int positionFinal;
    String trama = getTrama();
    String nombre;
    StringManagement datos;
    String descripcion;
    String identidad;

    public Rule(int tam) {
        super(tam);
    }

    // Rule Nombre Cliente
    public void NombreCliente(){
        if (trama != null) {
            for (int i = 0; i < trama.length(); i++) {
                Pattern patron = Pattern.compile("[^a-zA-Z]");
                Matcher mat = patron.matcher(trama);
                if (mat.find()) {
                    if (trama.length() == 13){
//                        List<String> lista = new ArrayList<String>();
//                        lista.add("Identidad");
                        System.out.println(trama);
                        nombre = trama;
                        descripcion = "Nombre Cliente";
                        // Metodo posicion Final de Identidad
                        positionFinal = i;
                    } else {
                        System.out.println("Identidad no valida");
                    }
                }
            }
        }
    }

     // Metodo Identidad
    public void Identidad() {
        if (trama != null) {
            for (int i = 0; i < trama.length(); i++) {
                Pattern patron = Pattern.compile("[0-9]");
                Matcher mat = patron.matcher(trama);
                if (mat.find()) {
                    if (trama.length() == 13){
//                        List<String> lista = new ArrayList<String>();
//                        lista.add("Identidad");
                        System.out.println(trama);
                        identidad = trama;
                        descripcion = "Identidad";
                        // Metodo posicion Final de Identidad
                        positionFinal = i;
                    } else {
                        System.out.println("Identidad no valida");
                    }
                }
            }
        }
    }

    // Metodo Initial Position Identidad
    public void InitialPosition(){
        trama = datos.getTrama();
        if (trama != null) {
            for (int i = 0; i < trama.length(); i++) {
                Pattern patron = Pattern.compile("[0-9]");
                Matcher mat = patron.matcher(trama);
                if (mat.find()) {
                   positionInitial = i;
                   break;
                }
            }
        }
    }

    // Metodo Final Position Nombre Cliente
    public void FinalPosition(){
        trama = datos.getTrama();
        if (trama != null) {
            for (int i = 0; i < trama.length(); i++) {
                Pattern patron = Pattern.compile("[$0-9]");
                Matcher mat = patron.matcher(trama);
                if (mat.find()) {
                    nombre = trama;
                    System.out.println(nombre);
                    positionFinal = i;
                    break;
                }
            }
        }
    }
}
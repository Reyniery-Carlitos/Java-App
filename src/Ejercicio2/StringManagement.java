package Ejercicio2;

import java.util.*;

public class StringManagement{
    int tam;
    public List<Rule> rule;
    Rule rules;
    String trama;

    // Metodo Constructor
    public StringManagement(int tam){
        this.tam = tam;
        List<Rule> rule = new ArrayList<>();
    }

    // SETTER DE TRAMA
    public void setTrama(String trama){
        this.trama = trama;
    }

    // GETTER DE TRAMA
    public String getTrama(){
        if (this.trama.length() != this.tam){
            String mensaje;
            mensaje = "WARNING: El tamanio de la trama no cumple con el tamanio definido";
            return mensaje;
        } else{
            return this.trama;
        }
    }

//     Metodo Asignar Regla
    public void AgregarRegla(){
        List<Rule> rule = new ArrayList<>();

    }

    // Metodo de la clase String Management
    public void stringManagement(Rule rule){

    }
}

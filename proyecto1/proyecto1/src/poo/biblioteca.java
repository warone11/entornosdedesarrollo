package poo;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private List<libro> libros;
    private List<sala> salas;
    public biblioteca(String nombre, String direccion, int horaApertura, int horaCierre){
        this.nombre=nombre;
        this.direccion=direccion;
        this.horaApertura=horaApertura;
        this.horaCierre=horaCierre;
        this.libros = new ArrayList<libro>();
        this.salas = new ArrayList<sala>();
    }


    public void estaAbierta(int hora){
        if(hora>this.horaApertura&&hora<this.horaCierre){
            System.out.println("Esta abierta");
        }
        else{
            System.out.println("Esta cerrada");
        }
    }
    public void esExtranjera(String Idioma){
        if(Idioma.equalsIgnoreCase("español")){
            System.out.println("No es extranjero");
        }
        else{
            System.out.println("Es extranjero");
        }
    }
    public  void informacion(){
        System.out.println("Biblioteca: "+this.nombre+" - "+this.direccion+". Abierto de "+this.horaApertura+" a "+this.horaCierre);
    }
    public void addLibro( libro l){
     libros.add(l);
    }
    public void addSala( sala s){
        salas.add(s);
    }
    public void removeLibro(libro l){
        libros.remove(l);
    }
    public void removeLibro(sala s){
        libros.remove(s);
    }
    public void mostrarLibros(){
        for (int i = 0; i < libros.size(); i++) {
            System.out.println("Libro "+i+": ISBN: "+getI);
            
        }
    }

}

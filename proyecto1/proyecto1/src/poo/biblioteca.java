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
    public void addSala( sala sala){
        salas.add(sala);
    }
    public void removeLibro(libro l){
        libros.remove(l);
    }
    public void removeLibro(sala s){
        libros.remove(s);
    }
    //funcion para mostrar libros
    public void mostrarLibros(){
        //variable temporal para guardar un libro
        libro libro1;
        //bucle que se ejecutara dependiendo del numero de libros que haya
        for (int i = 0; i < libros.size(); i++) {
            //establecer la variable libro1 con el libro en posicion i
            libro1=libros.get(i);
            libro1.informacion(i+1);
            
        }
    }
    //funcion para mostrar salas
    public void mostrarSalas(){
        //variable temporal para guardar un salas
        sala sala;
        //bucle que se ejecutara dependiendo del numero de salas que haya
        for (int i = 0; i < salas.size(); i++) {
            //establecer la variable sala con la sala en posicion i
            sala=salas.get(i);
            //mostrar por pantalla
            sala.informacion(i+1);
            System.out.println("La sala tiene "+sala.getPersonaSize()+" personas");
        }
    }
    public void mostrarSalasVacias(){
        sala sala;
        int j=1;
        for(int i= 0; i<salas.size();i++){
            sala=salas.get(i);
            if(sala.getPersonaSize()==0){
            sala.informacion(j);
            j++;
            }
        }
    }
    public void mostrarSalasDisponibles(){
        sala sala;
        int j=1;
        for(int i= 0; i<salas.size();i++){
            sala=salas.get(i);
            if(sala.isDisponible()){
            sala.informacion(j);
            j++;
            }
        }
    }
    public libro buscarLibroPorTitulo(String titulo){
        for (libro libro1 : this.libros) {
            if(libro1.getTitulo().equals(titulo))
            return libro1;
        }
        return null;
    }
    public int personasTotales(){
        int persona=0;
        for (sala sala : this.salas) {
            persona+=sala.getPersonaSize();
        }
        return persona;
    }

}

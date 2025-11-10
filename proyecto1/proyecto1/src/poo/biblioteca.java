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
    //funcion para mostrar libros
    public void mostrarLibros(){
        //variable temporal para guardar un libro
        libro libro1;
        //bucle que se ejecutara dependiendo del numero de libros que haya
        for (int i = 0; i < libros.size(); i++) {
<<<<<<< HEAD
            //establecer la variable libro1 con el libro en posicion i
            libro1=libros.get(i);
            //mostrar por pantalla el numero de libro, el nombre, el autor y el ISBN
            System.out.println(i+1+". Nombre: "+libro1.getNombre()+" Autor: "+libro1.getAutor()+" ISBN: "+libro1.getISBN());
=======
            System.out.println("Libro "+i+": ISBN: "+getI);
>>>>>>> 6bfd0022ee3b76b1ff385d2a1e038f24644695fb
            
        }
    }
    //funcion para mostrar salas
    public void mostrarSalas(){
        //variable temporal para guardar un salas
        sala sala;
        //bucle que se ejecutara dependiendo del numero de salas que haya
        for (int i = 0; i < libros.size(); i++) {
            //establecer la variable sala con la sala en posicion i
            sala=salas.get(i);
            //mostrar por pantalla el indice, numero de sala y las plazas
            System.out.println(i+1+". Numero: "+sala.getNumero()+" Plazas: "+sala.getPlazas());
            
        }
    }
    public libro buscarLibroPorTitulo(String titulo){
        for (libro libro1 : libros) {
            if(libro1.getNombre().equals(titulo))
            return libro1;
        }
        return null;
    }
}

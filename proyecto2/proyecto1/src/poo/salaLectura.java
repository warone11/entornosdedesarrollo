package poo;
import java.util.ArrayList;
import java.util.List;
public class salaLectura extends sala{
    private List<libro> listaLibros;
    salaLectura(String Nombre, int Capacidad, boolean Pizarra, String Tipo, boolean Disponible){
        super(Nombre, Capacidad, Pizarra, Tipo, Disponible);
        this.listaLibros= new ArrayList<libro>();
    }
    @Override
    public void informacion(int i){
        super.informacion(i);
        System.out.println("Listado de libros: ");
        for (int j = 0; j < listaLibros.size(); j++) {
            listaLibros.get(j).informacion(j);
        }

    }
    
    public void addLibro(libro l){
        listaLibros.add(l);
        this.getTipo().has
    }
    public void removeLibro(libro l){
        listaLibros.remove(l);
    }

}
    


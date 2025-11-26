package poo;
import java.util.ArrayList;
import java.util.List;
public class usuario extends persona {
    private List<libro> listaLibrosPrestados;
    private int Socio;
    public usuario(String nombre, int edad, String direccion, String apellidos, String DNI, String email, String telefono, String profesion, int AnosExperiencia, int Socio){
        super( nombre,  edad,  direccion,  apellidos,  DNI,  email,  telefono,  profesion,  AnosExperiencia);
        this.Socio=Socio;
        this.listaLibrosPrestados= new ArrayList<libro>();
        }
        @Override
        
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Num socio: "+this.Socio+"Listado de libros prestados: ");
        for (int j = 0; j < listaLibrosPrestados.size(); j++) {
            listaLibrosPrestados.get(j).informacion(j);
        }

    }
    public void addLibro(libro l){
        listaLibrosPrestados.add(l);
    }
    public void removeLibro(libro l){
        listaLibrosPrestados.remove(l);
    }
}

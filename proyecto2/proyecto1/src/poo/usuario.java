package poo;
import java.util.ArrayList;
import java.util.List;
public class usuario extends Persona {
    private List<libro> listaLibrosPrestados;
    private int Socio;
    public usuario(String nombre, int edad, String direccion, String apellidos, String DNI, String email, String telefono, String profesion, int AnosExperiencia, int Socio){
        super( nombre,  edad,  direccion,  apellidos,  DNI,  email,  telefono,  profesion,  AnosExperiencia);
        this.Socio=Socio;
        this.listaLibrosPrestados= new ArrayList<libro>();
        }
}

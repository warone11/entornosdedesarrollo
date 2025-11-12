package poo;

public class empleado extends Persona {
    private String puesto;
    private int sueldo;
    public empleado(String nombre, int edad, String direccion, String apellidos, String DNI, String email, String telefono, String profesion, int AnosExperiencia, String puesto, int sueldo){
        super( nombre,  edad,  direccion,  apellidos,  DNI,  email,  telefono,  profesion,  AnosExperiencia);
        this.puesto=puesto;
        this.sueldo=sueldo;
        }    
}

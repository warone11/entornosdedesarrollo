package poo;

import java.util.Date;

public class persona {
    private String DNI;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    private direccion direccion;

    public persona(String DNI, String nombre, Date fechaNacimiento, direccion direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad=edad;
        this.direccion=direccion;
    }
    
    public int getEdad() {
        return edad;
    }
    
}

package poo;

public class Persona{
    /**
     * Definicion de atributos de la persona
     * 
     */
    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;
    private String DNI;
    private String email;
    private String telefono;
    private String profesion;
    private int AnosExperiencia;


    /**
     * Definición del comportamiento de la persona
     *
     */
    public Persona(String nombre, int edad, String direccion, String apellidos, String DNI, String email, String telefono, String profesion, int AnosExperiencia){
        this.nombre=nombre;
        this.edad= edad;
        this.direccion=direccion;
        this.apellidos=apellidos;
        this.DNI=DNI;
        this.email=email;
        this.telefono=telefono;
        this.profesion=profesion;
        this.AnosExperiencia=AnosExperiencia;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+" y edad: "+getEdad()+" con esta direccion: "+this.direccion);
    }
    public int getEdad(){
        return this.edad;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDNI(){
        return this.DNI;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getProfesion(){
        return this.profesion;
    }
    public int getAnosExperiencia(){
        return this.AnosExperiencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.nombre=nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public boolean estaJubilado(){
        if(this.edad>=65){
            return true;
        }
        else{
            return false;
        }
    }
}


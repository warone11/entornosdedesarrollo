package poo;

import java.util.ArrayList;
import java.util.List;
public class sala {
    private String Nombre;
    private int Capacidad;
    private boolean Pizarra;
    private String Tipo;
    private boolean Disponible;
    private List<Persona> Personas;
    public sala(String Nombre, int Capacidad, boolean Pizarra, String Tipo, boolean Disponible){
        this.Nombre=Nombre;
        this.Capacidad=Capacidad;
        this.Pizarra=Pizarra;
        this.Tipo=Tipo;
        this.Disponible=Disponible;
        this.Personas= new ArrayList<Persona>();
        
    }

    public boolean isDisponible() {
        return this.Disponible;
    }

    public boolean isPizarra() {
        return this.Pizarra;
    }
    
    public String getNombre() {
        return this.Nombre;
    }

    public String getTipo() {
        return this.Tipo;
    }
    public void setDisponible(boolean disponible) {
        this.Disponible = disponible;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setTipo(String Tipo) {
        if(Tipo.equals("estudio")||Tipo.equals("lectura")||Tipo.equals("infantil"))
        this.Tipo = Tipo;
    }
    public void setPizarra(boolean Pizarra) {
        this.Pizarra = Pizarra;
    }
    public int getCapacidad() {
        return this.Capacidad;
    }
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
    public void entrarPersona(Persona persona){
        if(Personas.size()<this.Capacidad)
        Personas.add(persona);
        else
        System.out.println("Sala llena");
    }
    public void salirPersona(Persona persona){
        if(!Personas.isEmpty())
            Personas.remove(persona);
        else
        System.out.println("La sala ya esta vacia");
    }
    public void mostrarPersonas(){
        int i=1;
        for(Persona persona:Personas){
            System.out.println(i+" Nombre: "+persona.getNombre()+" Apellidos: "+persona.getApellidos()+" Edad: "+persona.getEdad()+" Email: "+persona.getEmail());
            i++;
        }
    }

    public int getPersonaSize(){
        return Personas.size();
    }
    
    public void estaDisponible(){
        if(this.Disponible)
        System.out.println("Esta disponible");
        else
        System.out.println("No esta disponible");
    }
    public void tienePizarra(){
        if(this.Pizarra)
        System.out.println("Tiene pizarra");
        else
        System.out.println("No tiene pizarra");
    }
    public String estaDisponibletxt(){
        if(this.Disponible)
        return "esta disponible";
        else
        return "no esta disponible";
    }
    public String tienePizarratxt(){
        if(this.Disponible)
        return "tiene pizarra";
        else
        return "no tiene pizarra";
    }
    public void informacion(int numero){
        System.out.println("Sala "+numero+": "+getNombre()+" - "+getCapacidad()+". Se utiliza para "+getTipo()+", "+tienePizarratxt()+" y "+estaDisponibletxt());
    }
}

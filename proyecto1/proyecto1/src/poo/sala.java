package poo;

import java.util.ArrayList;
import java.util.List;
public class sala {
    private int Numero;
    private int Plazas;
    private List<Persona> Personas;
    public sala(){
        this.Numero=0;
        this.Plazas=0;
        this.Personas= new ArrayList<Persona>();

    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getPlazas() {
        return Plazas;
    }
    public void setPlazas(int Plazas) {
        this.Plazas = Plazas;
    }
    public void entrarPersona(Persona persona){
        if(Personas.size()<Plazas)
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
        }
    }
}

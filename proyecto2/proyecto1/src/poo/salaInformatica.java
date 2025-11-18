package poo;

public class salaInformatica extends sala{
    private int numEquipos;
    salaInformatica(String Nombre, int Capacidad, boolean Pizarra, String Tipo, boolean Disponible, int numEquipos){
        super(Nombre, Capacidad, Pizarra, Tipo, Disponible);
        this.numEquipos=numEquipos;
    }
    @Override
    public void informacion(int i){
        super.informacion(i);
        System.out.println("Numero de equipos: "+this.numEquipos);
        
    }
}
    

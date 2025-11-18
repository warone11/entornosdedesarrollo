package poo;

public class salaEstudio extends sala{
    private int numMesas;
    salaEstudio(String Nombre, int Capacidad, boolean Pizarra, String Tipo, boolean Disponible, int numMesas){
        super(Nombre, Capacidad, Pizarra, Tipo, Disponible);
        this.numMesas=numMesas;
    }
    @Override
    public void informacion(int i){
        super.informacion(i);
        System.out.println("Numero de mesas: "+this.numMesas);

    }
}

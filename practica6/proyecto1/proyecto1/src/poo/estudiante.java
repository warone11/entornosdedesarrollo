package poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class estudiante extends persona{
    private boolean esRepetidor;
    private List<matricula> matriculas;

    estudiante(String DNI, String nombre, Date fechaNacimiento, direccion direccion, boolean esRepetidor){
        super(DNI, nombre, fechaNacimiento, direccion);
        this.esRepetidor=esRepetidor;
        matriculas= new ArrayList<matricula>();
    }
    public matricula inscribir(curso c){
        matricula m= new matricula(null, null);
        return m;
    }
}

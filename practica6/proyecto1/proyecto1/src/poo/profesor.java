package poo;

import java.util.Date;

public class profesor extends persona{
    private double salario;
    private curso curso;

    public profesor(String DNI, String nombre, Date fechaNacimiento,direccion direccion, double salario) {
        super(DNI, nombre, fechaNacimiento, direccion);
        this.salario = salario;
    }
    public void asignarCurso(curso c){
        this.curso=c;

    }
    

}

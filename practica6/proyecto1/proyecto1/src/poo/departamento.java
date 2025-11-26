package poo;

import java.util.ArrayList;
import java.util.List;

public class departamento {
    private String nombre;
    private List<curso> cursos;
    public departamento(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<curso>();
    }
    
}

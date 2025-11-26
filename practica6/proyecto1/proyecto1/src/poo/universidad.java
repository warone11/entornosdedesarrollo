package poo;

import java.util.ArrayList;
import java.util.List;

public class universidad {
    private String nombre;
    private List<departamento> departamentos;
    public universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<departamento>();
    }
}

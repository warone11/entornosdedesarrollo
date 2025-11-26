package poo;
import java.util.ArrayList;
import java.util.List;
public class curso {
    private String curso;
    private String nombre;
    private int CupoMaximo;
    private List<matricula> matriculas;
    private List<horario> horarios;
    public curso(String curso, String nombre, int CupoMaximo) {
        this.curso = curso;
        this.nombre = nombre;
        this.CupoMaximo = CupoMaximo;
        matriculas = new ArrayList<matricula>();
    }
    public matricula inscribir(estudiante e){
        matricula m= new matricula(null, null);
        return m;

    }

}

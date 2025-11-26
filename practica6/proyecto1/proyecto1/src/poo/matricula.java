package poo;
import java.util.Date;
public class matricula {
    private Date fecha;
    private Double notaFinal;
    public matricula(Date fecha, Double notaFinal) {
        this.fecha = fecha;
        this.notaFinal = notaFinal;
    }
    public double calcularNotaFinal(){
        double nota=6.54;
        return nota;
    }
}

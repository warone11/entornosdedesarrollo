package poo;

import java.sql.Time;

public class horario {
    private String diaSemana;
    private Time horaInicio;
    private Time horaFinal;

    public horario(String diaSemana, Time horaInicio, Time horaFinal) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }
    
}

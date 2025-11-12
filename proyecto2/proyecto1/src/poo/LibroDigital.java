package poo;

public class LibroDigital extends libro {
    private int TamanoMB;
    private String formato;
    LibroDigital(String Titulo, String ISBN, String Editorial, String Idioma, int anyo, boolean disponible, int TamanoMB,  String formato){
        super(Titulo, ISBN, Editorial, Idioma, anyo, disponible);
        this.TamanoMB=TamanoMB;
        this.formato=formato;
    }
}

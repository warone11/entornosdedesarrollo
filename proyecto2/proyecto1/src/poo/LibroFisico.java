package poo;

public class LibroFisico extends libro {
    private int NumDePaginas;
    private String ubicacion;
    LibroFisico(String Titulo, String ISBN, String Editorial, String Idioma, int anyo, boolean disponible, int NumDePaginas,  String ubicacion){
        super(Titulo, ISBN, Editorial, Idioma, anyo, disponible);
        this.NumDePaginas=NumDePaginas;
        this.ubicacion=ubicacion;
    }
}

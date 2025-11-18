package poo;

public class LibroFisico extends libro {
    private int NumDePaginas;
    private String ubicacion;
    LibroFisico(String Titulo, String ISBN, String Editorial, String Idioma, int anyo, boolean disponible, int NumDePaginas,  String ubicacion){
        super(Titulo, ISBN, Editorial, Idioma, anyo, disponible);
        this.NumDePaginas=NumDePaginas;
        this.ubicacion=ubicacion;
    }

    @Override
    public void informacion(int numero) {
        super.informacion(numero);
        System.out.println("Numero de paginas: "+this.NumDePaginas+", ubicacion: "+this.ubicacion);
    }
    public int getNumDePaginas() {
        return this.NumDePaginas;
    }
    
    public String getUbicacion() {
        return this.ubicacion;
    }

    
    
}

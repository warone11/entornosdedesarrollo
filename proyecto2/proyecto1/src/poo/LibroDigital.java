package poo;

public class LibroDigital extends libro {
    private int TamanoMB;
    private String formato;
    LibroDigital(String Titulo, String ISBN, String Editorial, String Idioma, int anyo, boolean disponible, int TamanoMB,  String formato){
        super(Titulo, ISBN, Editorial, Idioma, anyo, disponible);
        this.TamanoMB=TamanoMB;
        this.formato=formato;
    }
    @Override
    public void informacion(int numero) {
        super.informacion(numero);
        System.out.println("Tamaño archivo: "+this.TamanoMB+"MB, formato: "+this.formato);
    }

    public int getTamanoMB() {
        return this.TamanoMB;
    }
    public String getFormato() {
        return this.formato;
    }
}

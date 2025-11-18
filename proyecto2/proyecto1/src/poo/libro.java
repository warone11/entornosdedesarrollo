package poo;

public class libro {
    private String ISBN;
    private String Titulo;
    private String Editorial;
    private String Idioma;
    private int anyo;
    private boolean disponible;

    public libro(String Titulo, String ISBN, String Editorial, String Idioma, int anyo, boolean disponible){
        this.ISBN=ISBN;
        this.Titulo=Titulo;
        this.Editorial=Editorial;
        this.Idioma=Idioma;
    
        this.anyo=anyo;
        this.disponible=disponible;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getIdioma() {
        return Idioma;
    }
    

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Nombre) {
        this.Titulo = Nombre;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    public void estaDisponible(){
        if(this.disponible){
            System.out.println("Esta disponible");
        }
        else{
        System.out.println("No esta disponible");
        }
    }
    public String estaDisponibletxt(){
        if(this.disponible){
            return "Esta disponible";
        }
        else{
            return "No esta disponible";
        }
    }
    public void esExtranjero(){
        if(Idioma.equalsIgnoreCase("Español")){
            System.out.println("Esta escrito en lengua extranjera");
        }
        else{
        System.out.println("Esta escrito en lengua española ");
        }
    }
    public void informacion(int numero){
        System.out.println("Libro "+(numero+1)+": "+getTitulo()+" - "+getEditorial()+" - "+getEditorial()+" ("+getAnyo()+"). "+getIdioma()+". "+estaDisponibletxt());
    }
}

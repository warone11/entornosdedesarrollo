package poo;

public class libro {
    private String ISBN;
    private String Nombre;
    private String Autor;
    public libro(){
        this.ISBN="";
        this.Nombre="";
        this.Autor="";

    }

    public String getAutor() {
        return Autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}

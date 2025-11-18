package poo;
public class Main {
    public static void main(String[] args){
        biblioteca central= new biblioteca("aaaaaa","calle falsa 123", 11, 19);
        LibroDigital libro1= new LibroDigital("hurry potar", "7537692", "editorial editorial", "chino", 1990, true,10,"pdf");
        LibroFisico libro2= new LibroFisico("hurry potar 2", "7543952", "editorial editorial", "español", 1992, true, 300, "cadiz");
        salaInformatica sala1= new salaInformatica("informatica", 20, false, "informatica", true, 20);
        salaLectura sala2= new salaLectura("lectura", 20, false, "lectura", true);
        usuario usuario = new usuario("pepe", 20, "calle falsa 321", "garcia", "752729527F", "email@gmail.com", "+34 36987345", "fontanero", 5, 56543);
        empleado empleado = new empleado("pepa", 20, "calle falsa 3333", "otro garcia", "654529527F", "email@gmail.com", "+34 36687345", "segurata", 10, "segurata", 1200 );
        central.addSala(sala1);
        central.addSala(sala2);
        central.addLibro(libro1);
        central.addLibro(libro2);
        central.asignarResponsable(empleado, sala2);
        central.asignarResponsable(usuario, sala1);
        central.registrarVisita(usuario);
        
        usuario.addLibro(libro1);
        usuario.addLibro(libro2);
        sala2.addLibro(libro1);
        sala2.addLibro(libro2);
        central.mostrarInformacion();
    }
}

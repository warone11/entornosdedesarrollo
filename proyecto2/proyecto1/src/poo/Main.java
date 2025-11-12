package poo;
public class Main {
    public static void main(String[] args){
        PersonaPOO persona1 = new PersonaPOO("Mbappe", 26,"","","","","","",0);
        
        persona1.mostrarInformacion();
        System.out.println("Para la persona 1 sabemos que tiene "+ persona1.getEdad()+" edad");
        persona1.setApellidos("hola");
        System.out.println(persona1.getApellidos());
        biblioteca biblioteca1 = new biblioteca("Papel", "Calle falsa 123", 9, 22);
        biblioteca1.estaAbierta(23);
        biblioteca1.esExtranjera("ingles");
        biblioteca1.informacion();

    }
}

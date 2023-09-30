package mx.utel.poo.arreglos;

public class ArgumentosVariables {

    public static void main(String[] args) {
        ArgumentosVariables prog = new ArgumentosVariables();
        String[] nombres = {"Edwin Carrillo", "Edwin Javier Blanco", "Gerardo Solano"};
        prog.imprimir1( nombres );

        prog.imprimir2();
        prog.imprimir2("Edwin");
        prog.imprimir2("Edwin", "Edwin");
        prog.imprimir2("Edwin", "Edwin", "Gerardo");
        prog.imprimir2("Edwin", "Edwin", "Gerardo", "Alejandro");

    }

    private void imprimir1( String[] nombres ) {
        System.out.println("Ejecutando Imprimir1...");
        for (String nombre : nombres) System.out.println(nombre);
    }

    private void imprimir2( String ... nombres ) {
        System.out.println("Ejecutando Imprimir2...");
        for (String nombre : nombres) System.out.println(nombre);
    }


}

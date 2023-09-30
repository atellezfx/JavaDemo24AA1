package mx.utel.poo.arreglos;

import java.util.Arrays;

public class ArreglosSimples {

    public static void main(String[] args) {
        ArreglosSimples prog = new ArreglosSimples();
        Empleado[] nomina = prog.crearArreglo();
        prog.imprimeArreglo(nomina);
    }

    private void imprimeArreglo(Empleado[] nomina) {
        // IMPRIME ARREGLO OCUPANDO FOR TRADICIONAL
//        for (int i = 0; i < nomina.length; i++) {
//            if( nomina[i].nombre().endsWith("o") )
//                System.out.println(nomina[i]);
//        }
        // IMPRIME ARREGLO OCUPANDO FOR EACH
//        for( Empleado emp : nomina ) {
//            System.out.println(emp);
//        }
        // IMPRIME ARREGLO OCUPANDO STREAMS (PROG. FUNCIONAL)
//        Arrays.stream( nomina )
//                .filter( emp -> emp.nombre().endsWith("o") )
//                .forEach( emp -> System.out.println(emp) );
        // IMPRIME ARREGLO OCUPANDO STREAMS (PROG. FUNCIONAL 2)
        Arrays.stream( nomina ).forEach( System.out::println );
    }

    private Empleado[] crearArreglo() {
        Empleado[] arreglo = new Empleado[5];
        arreglo[0] = new Empleado("12", "Benito Bodoque");
        arreglo[1] = new Empleado("14", "Don Gato");
        arreglo[2] = new Empleado("16", "Demóstenes");
        arreglo[3] = new Empleado("18", "Cucho");
        arreglo[4] = new Empleado("20", "Espanto");
        return arreglo;
    }

}

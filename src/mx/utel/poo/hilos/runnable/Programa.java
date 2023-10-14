package mx.utel.poo.hilos.runnable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Stream;

public class Programa {

    private ArrayList<Empleado> empleados =  new ArrayList<Empleado>(6); // Puede crecer

    public static void main(String[] args) {
        Programa prog = new Programa();
        prog.contratar( Recolector::new, "Benito", "Demóstenes", "Matute", "Don Gato");
        prog.contratar(MaestroTostador::new, "Bart", "Lisa");
        prog.iniciarJornadaLaboral();
    }

    private void contratar(Function<String, Empleado> funcion, String ... nombres ) {
        Stream.of( nombres ).map( funcion ).forEach( empleados::add );
    }

    private void iniciarJornadaLaboral() {
        ExecutorService servicio = Executors.newCachedThreadPool();
        empleados.forEach( servicio::execute );
        servicio.shutdown();
//        for (Empleado empleado : empleados) {
//            service.execute( empleado );
//        }
    }

}

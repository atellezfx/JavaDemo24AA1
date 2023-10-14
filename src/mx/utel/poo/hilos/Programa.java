package mx.utel.poo.hilos;

import java.util.ArrayList;

public class Programa {

    private ArrayList<Empleado> empleados =  new ArrayList<Empleado>(6); // Puede crecer

    public static void main(String[] args) {
        Programa prog = new Programa();
        prog.contratarRecolectores("Benito", "Demóstenes", "Matute", "Don Gato");
        prog.contratarMaestrosTostadores("Bart", "Lisa");
        prog.iniciarJornadaLaboral();
    }

    private void contratarRecolectores( String ... nombres ) {
        for (String cad : nombres) empleados.add( new Recolector( cad ) );
    }

    private void contratarMaestrosTostadores( String ... nombres ) {
        for (String cad : nombres) empleados.add( new MaestroTostador( cad ) );
    }

    private void iniciarJornadaLaboral() {
        for (Empleado emp : empleados) {
            emp.start();
        }
    }

}

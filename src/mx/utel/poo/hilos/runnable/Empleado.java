package mx.utel.poo.hilos.runnable;

public abstract class Empleado implements Runnable {

    private final int HORAS_LABORABLES = 4;
    protected Granero granero = Granero.obtener();
    protected final String NOMBRE;

    public Empleado(String nombre) {
        this.NOMBRE = nombre;
    }

    @Override
    public void run() {
        for( int i = 0; i < HORAS_LABORABLES; i++ ) trabajar();
        System.out.printf("#### %s terminó de trabajar\n", NOMBRE );
    }

    protected abstract void trabajar();

}

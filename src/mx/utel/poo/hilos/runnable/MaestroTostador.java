package mx.utel.poo.hilos.runnable;

public class MaestroTostador extends Empleado {

    private final int GRAMOS_CAFE_TOSTADO = 500;

    public MaestroTostador(String nombre) {
        super(nombre);
    }

    @Override
    protected void trabajar() {
        try {
            System.out.printf("> %s esperando cosecha.\n", NOMBRE );
            granero.retirar( GRAMOS_CAFE_TOSTADO );
            Thread.sleep( 1000 );
            System.out.printf("> %s ha tostado %d grs de café. \t Granero: %d grs.\n",
                    NOMBRE, GRAMOS_CAFE_TOSTADO, granero.totalAlmacenado());
        } catch(InterruptedException ex) {
            System.err.println("El trabajo del maestro tostador fue interrumpido");
            ex.printStackTrace();
        }
    }
}

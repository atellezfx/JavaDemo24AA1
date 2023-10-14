package mx.utel.poo.hilos;

public class Recolector extends Empleado {

    private final int GRAMOS_CAFE_RECOLECTADO = 250;

    public Recolector(String nombre) {
        super(nombre);
    }

    @Override
    protected void trabajar() {
        try {
            Thread.sleep(1000); // Simular el tiempo de cosecha: 60 min
            granero.almacenar( GRAMOS_CAFE_RECOLECTADO );
            System.out.printf("> %s cosechó %d grs de café. \t Granero: %d grs.\n",
                    getName(), GRAMOS_CAFE_RECOLECTADO, granero.totalAlmacenado());
        } catch(InterruptedException ex) {
            System.err.println("El trabajo del recolector fue interrumpido");
            ex.printStackTrace();
        }
    }
}

package mx.utel.poo.hilos;

public class Granero {

    private int cafeAlmacenado;

    // APLICANDO PATRÓN DE DISEÑO SINGLETON ####################
    private static Granero instancia;

    private Granero() { }

    public static Granero obtener() {
        if( instancia == null ) instancia = new Granero(); // Lazy-loading
        return instancia;
    }

    // #########################################################

    public synchronized void almacenar(int cantidad) {
        cafeAlmacenado += cantidad;
        if( hayCafe() ) notify();
    }

    public synchronized void retirar(int cantidad) throws InterruptedException {
        if( !hayCafe() ) wait();
        cafeAlmacenado -= cantidad;
    }

    public synchronized boolean hayCafe() {
        return cafeAlmacenado >= 500;
    }

    public synchronized int totalAlmacenado() {
        return cafeAlmacenado;
    }

}

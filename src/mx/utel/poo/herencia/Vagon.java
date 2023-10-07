package mx.utel.poo.herencia;

public abstract class Vagon implements Vehiculo, Contenedor {

    protected final String CONTENIDO;

    public Vagon(String CONTENIDO) {
        this.CONTENIDO = CONTENIDO;
    }

    public String tipo() {
        String nombre = this.getClass().getSimpleName(); // VagonCerrado o VagonCisterna
        return nombre.replace("Vagon", "").toLowerCase();
    }

    public abstract float volumen();

    public String toString() {
        return String.format("Vagón %s con un volúmen de %.2fm³", tipo(), volumen());
    }

}

package mx.utel.poo.herencia;

public class VagonCerrado extends Vagon {

    private float ladoA, ladoB, largo;

    public VagonCerrado(String CONTENIDO) {
        this( CONTENIDO, 3.0f, 3.0f, 15.4f );
    }

    @Override
    public boolean esDePasajeros() {
        return false;
    }

    @Override
    public boolean esContenedor() {
        return true;
    }

    public VagonCerrado(String CONTENIDO, float ladoA, float ladoB, float largo) {
        super(CONTENIDO);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.largo = largo;
    }

    @Override
    public float volumen() {
        return ladoA * ladoB * largo;
    }
}

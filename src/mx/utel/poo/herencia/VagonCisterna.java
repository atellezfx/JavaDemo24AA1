package mx.utel.poo.herencia;

public class VagonCisterna extends Vagon {

    private float largo, radio;

    public VagonCisterna(String CONTENIDO) {
        this( CONTENIDO, 12.3f, 2.4f );
    }

    @Override
    public boolean esDePasajeros() {
        return false;
    }

    @Override
    public boolean esContenedor() {
        return true;
    }

    public VagonCisterna(String CONTENIDO, float largo, float radio) {
        super(CONTENIDO);
        this.largo = largo;
        this.radio = radio;
    }

    @Override
    public float volumen() {
        float radio2 = (float) Math.pow( radio, 2 );
        return (float) (Math.PI * radio2 * largo);
    }
}

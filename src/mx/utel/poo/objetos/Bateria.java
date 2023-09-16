package mx.utel.poo.objetos;

public record Bateria(float voltaje, int amperaje, boolean recargable) {

    @Override
    public String toString() {
        String cadena = "Batería %s %dmAh %.2fv";
//        if( recargable ) return cadena.formatted( "recargable", amperaje, voltaje );
//        return cadena.formatted( "alcalina", amperaje, voltaje );
        return cadena.formatted( recargable ? "recargable" : "alcalina", amperaje, voltaje );
    }
}

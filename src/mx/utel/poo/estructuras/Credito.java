package mx.utel.poo.estructuras;

public class Credito {

    private double monto, interes; // 0.10

    public Credito(double monto, double interes) {
        this.monto = monto;
        this.interes = interes;
    }

    @Override
    public String toString() {
//        int tasa = (int) (interes * 100);
//        String cadena = "Crédito autorizado por $%,.2f con una tasa del %d%%";
//        return cadena.formatted( monto, tasa );
        return String.format( "Crédito autorizado por $%,.2f con una tasa del %.0f%%",
                monto, interes * 100);
    }
}

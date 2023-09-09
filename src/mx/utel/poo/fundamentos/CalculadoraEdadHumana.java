package mx.utel.poo.fundamentos;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdadHumana {

    public int calcular(Perro p)  {
        int edadNatural = p.edad();
        if( edadNatural <= 2 ) return edadPorMeses(p);
        return edadPorTalla(p);
    }

    private int edadPorTalla(Perro p) {
        Talla talla = p.getTalla();
        int edadNatural = p.edad();
        return 24 + (( edadNatural - 2 ) * talla.getDiferencia());
    }

    private int edadPorMeses(Perro p) {
        int meses = obtenerMeses(p.getFechaNac());
        if( meses <= 2 ) return 2;
        if( meses <= 4 ) return 6;
        if( meses <= 6 ) return 10;
        if( meses <= 8 ) return 12;
        if( meses <= 10 ) return 14;
        if( meses <= 12 ) return 16;
        if( meses <= 18 ) return 20;
        return 24;
    }

    public int obtenerMeses( LocalDate fechaNac ) {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getMonths();
    }


}

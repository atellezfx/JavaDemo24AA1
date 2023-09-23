package mx.utel.poo.estructuras;

import java.time.LocalDate;
import java.time.Period;

public record Cliente(String nombre, LocalDate fechaNac) {

    public int edad() {
//        LocalDate hoy = LocalDate.now();
//        Period per = Period.between(fechaNac, hoy);
//        return per.getYears();
        return Period.between( fechaNac, LocalDate.now() ).getYears();
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s, %d años", nombre, edad());
    }

    public Categoria determinarCategoria() {
//        var valores = Categoria.values();
//        for( int i = 0; i < valores.length; i++  ) {
//            if( valores[i].clasifica( edad() ) ) return valores[i];
//        }
        for( Categoria cat : Categoria.values() ) {
            if( cat.clasifica( edad() ) ) return cat;
        }
        return null; // // TODO: Explicar porque es peligroso regresar null (Optionals)
    }



}

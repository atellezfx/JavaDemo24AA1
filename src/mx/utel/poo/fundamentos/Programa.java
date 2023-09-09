package mx.utel.poo.fundamentos;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Denver", LocalDate.of(2014, 11, 8), Talla.GRANDE);
        System.out.println(perro1);

        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();
        int edadHumana = calc.calcular(perro1);
        System.out.printf("Edad humana: %d", edadHumana);

    }

}

package mx.utel.poo.fundamentos;

import java.time.LocalDate;
import java.time.Period;

public class Perro {

    private String nombre;
    private LocalDate fechaNac;
    private Talla talla;

    public Perro(String nombre, LocalDate fechaNac, Talla talla) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public Talla getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        // En esta línea se crean 11 cadenas de texto
        // return "Perro: " + nombre + ", edad: " + edad() + ", talla: " + talla;
        String cadena = "Perro: %s, edad: %d, talla: %s";
        return cadena.formatted(nombre, edad(), talla);
    }
}

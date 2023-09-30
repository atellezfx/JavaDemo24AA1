package mx.utel.poo.arreglos;

public record Empleado(String id, String nombre) {

    @Override
    public String toString() {
        return String.format("Empleado: %s, id: %s", nombre, id);
    }
}

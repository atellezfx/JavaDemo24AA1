package mx.utel.poo.objetos;

public class Programa {

    public static void main(String[] args) {
        Bateria bat1 = new Bateria(1.5f, 900, false);
        Foco f1 = new Foco(1200, Luz.NEUTRA, Modelo.LED);

        Linterna lit1 = new Linterna("Steren", "Naranja", f1);
        System.out.println(lit1);
        lit1.encender();

        lit1.colocarBateria( bat1 );
        lit1.encender();

        System.out.println(lit1);
    }

}

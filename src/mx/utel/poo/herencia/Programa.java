package mx.utel.poo.herencia;

public class Programa {

    public static void main(String[] args) {
        VagonCerrado vc1 = new VagonCerrado("Neumáticos");
        System.out.println(vc1);

        VagonCisterna vs1 = new VagonCisterna( "Diesel" );
        System.out.println(vs1);

        VagonAutorack va1 = new VagonAutorack("Audi A6 x6");
        System.out.println( va1 );

        Tren t1 = new Tren( new Maquina("El Olivo") );
//        t1.conectarVagones();

        t1.conectarVagones( vc1, vs1, va1 );
        System.out.println(t1);
    }

}

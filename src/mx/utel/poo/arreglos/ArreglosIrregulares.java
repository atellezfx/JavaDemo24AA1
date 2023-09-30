package mx.utel.poo.arreglos;

public class ArreglosIrregulares {

    public static void main(String[] args) {
        ArreglosIrregulares prog = new ArreglosIrregulares();
        String[][] personajes = prog.crearArreglo();
        prog.imprimeArreglo( personajes );
    }

    private void imprimeArreglo(String[][] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.printf("Personajes de %s\n", casaProductora(i));
            for (int j = 0; j < personajes[i].length; j++) {
                System.out.printf("\t⇨ %s\n", personajes[i][j] );
            }
        }
    }

    private String casaProductora(int i) {
        return switch ( i ) {
            case 0 -> "Hanna-Barbera";
            case 1 -> "Disney";
            case 2 -> "Simpsons";
            default -> "Desconocido";
        };
    }

    private String[][] crearArreglo() {
        String[][] personajes = new String[3][];
        final int HANNAB = 0, DISNEY = 1, SIMPSONS = 2;

        // PERSONAJES DE HANNA-BARBERA
        personajes[HANNAB] = new String[4];
        personajes[HANNAB][0] = "Scooby-Doo";
        personajes[HANNAB][1] = "Pablo Mármol";
        personajes[HANNAB][2] = "Mandibulín";
        personajes[HANNAB][3] = "Magila Gorilla";

        // PERSONAJES DE DISNEY
        personajes[DISNEY] = new String[8];
        personajes[DISNEY][0] = "Hércules";
        personajes[DISNEY][1] = "Aladín";
        personajes[DISNEY][2] = "Mulán";
        personajes[DISNEY][3] = "Nemo";
        personajes[DISNEY][4] = "Dumbo";
        personajes[DISNEY][5] = "Mickey Mouse";
        personajes[DISNEY][6] = "Kim Posible";
        personajes[DISNEY][7] = "Donald Duck";

        // PERSONAJES DE SIMPSONS
        personajes[SIMPSONS] = new String[5];
        personajes[SIMPSONS][0] = "Moe Szyslak";
        personajes[SIMPSONS][1] = "Bartolomeo";
        personajes[SIMPSONS][2] = "Lisa";
        personajes[SIMPSONS][3] = "Krusty";
        personajes[SIMPSONS][4] = "Bob Patiño";

        return personajes;
    }

}

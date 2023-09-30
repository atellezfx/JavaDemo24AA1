package mx.utel.poo.arreglos;

import java.util.Arrays;

public class SumaArreglo {

    public static void main(String[] args) {
        SumaArreglo prog = new SumaArreglo();
//        int[] valores = {2,4,8,16,32,64,128,256,512,1024,2048,4096};
        int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.printf("El arreglo a ocupar es:\n\t%s\n", Arrays.toString( valores ));

        int total1 = prog.sumarV1( valores );
        System.out.printf("El resultado de la suma-v1 es: %d\n", total1);

        int total2 = prog.sumarV2( valores );
        System.out.printf("El resultado de la suma-v2 es: %d\n", total2);
    }

    private int sumarV2( int[] arreglo ) {
        return Arrays.stream( arreglo ).filter( this::esPrimo ).sum();
    }

    private int sumarV1(int[] arreglo) {
        int total = 0;
        for (int num : arreglo)  {
            if( esPrimo( num ) ) {
                total += num;
            }
        }
        return total;
    }

    private boolean esPrimo( int numero ) {
        if( numero <= 1 ) return false;
        int numDiv = 0;
        for( int i = numero; i > 0; i-- ) {
            if( numero % i == 0 ) numDiv++;
        }
        return numDiv == 2;
    }


}

package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_20 {
    public static final int MAX = 20;
    public static final int MAXPATRON = 10;
    public static final int SEPARADOR = 0;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD_NUMERO = 0.4;

    public static void main(String[] args) {
        /*
         * 20. Hacer un programa que elimine de un arreglo todas las
         * ocurrencias de una secuencia patrón dada por otro arreglo.
         * 
         */
        int arreglo[] = {0,2,0,4,2,0,0,1,2,3,0,2,0,0,2,3,6,4,0,0};
        int patron[] = {0,0,0,1,2,3,0,0,0,0};
        
        imprimirArreglo(arreglo);
        eliminar_ocurrencias_de_arreglo_de_secuencia_patron(arreglo, patron);
     
        
    }


    private static void eliminar_ocurrencias_de_arreglo_de_secuencia_patron(int[] arreglo, int[] patron) {
        int fin = 0;
        int ini = buscar_inicio(arreglo, fin);
        int iniP, finP = 0;
        boolean esLaSecuencia = false;
        while (ini<MAX) {
            fin = buscar_fin(arreglo, ini);
            if (ini<MAX) {
                
                iniP = buscar_inicio(patron, finP);
                finP = buscar_fin(patron, iniP);
                esLaSecuencia = esSecuencia(arreglo,ini,fin,iniP,finP);
                while (!esLaSecuencia) {
                    corrimiento_izq(arreglo, ini, fin);
                }
            }
            ini = buscar_inicio(arreglo, fin+1);
        }
    }



    public static void corrimiento_izq(int[] arreglo, int ini, int fin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'corrimiento_izq'");
    }


    public static boolean esSecuencia(int[] arreglo, int ini, int fin, int iniP, int finP) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esSecuencia'");
    }


    private static int buscar_fin(int[] arreglo, int ini) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar_fin'");
    }


    private static int buscar_inicio(int[] arreglo, int fin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar_inicio'");
    }


    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}

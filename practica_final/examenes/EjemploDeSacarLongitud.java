public class EjemploDeSacarLongitud {
    public static final int MAX = 10;
    public static final int MAX2 = 3;
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,1,2,4,1,4,3,2};
        int [] arr2 = {1,2,4};
        noSonIguales(arr1,arr2);
        imprimir_arreglo(arr1);
    }
    public static void noSonIguales(int[] arr1, int[] arr2) {
        int posCoinIni = 0;
        
        for (int i = 0; i < MAX2; i++) {
            posCoinIni=obtener_primer_coincidencia(arr1,arr2[i]);
            
            borrar_elementos(arr1, posCoinIni);
        }
    }
    public static void borrar_elementos(int[] arr1, int posCoinIni) {
        while(posCoinIni < MAX-1){
            arr1[posCoinIni] = arr1[posCoinIni + 1];
            posCoinIni++;
        }
    }
    public static int obtener_primer_coincidencia(int[] arr1, int f) {
        int pos = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr1[i] == f) {
                pos = arr1[i];
            }
        }
        return pos;
    }

    public static void imprimir_arreglo(int [] arreglo){
        for (int i = 0; i < MAX; i++) {
            System.out.println("Arreglo array["+i+"] -> " + arreglo[i]);
        }
    }
}

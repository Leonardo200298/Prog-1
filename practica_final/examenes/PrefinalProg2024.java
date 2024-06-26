public class PrefinalProg2024 {
    public static final int SEPARADOR = 0;
    public static final int X = 600;
    public static final int M = 15;
    public static final int N = 3;

    public static void main(String[] args) {
        int[][] matVentas = { { 0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0 },
                { 0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0 },
                { 0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0 } };
        int[] A1 = { 1, 2, 0 };
        int[] A2 = { 3, 0, 0 };
        recorrer_por_mes(matVentas, A1, A2);
    }

    public static void recorrer_por_mes(int[][] matrizv, int[] arr1, int[] arr2) {

        for (int i = 0; i < N; i++) {
            if (arr1[i] != SEPARADOR) {
                recorrrer_por_dia(matrizv[arr1[i]], matrizv[arr2[i]]);
            }
        }
    }

    public static void recorrrer_por_dia(int [] arrDeA, int [] arrDeB){
        int contadorDeSecuencias = 0;
        int fin = 0;
        int ini = buscar_ini(arrDeA, fin);
        int sumar1 = 0;
        while (ini < M) {
            fin = buscar_fin(arrDeA,ini); 
            if (ini < M) {
                sumar1 = sumar(arrDeA, ini, fin);
                contadorDeSecuencias++;
            }
            ini = buscar_ini(arrDeA, fin + 1);
            System.out.println("los promedios son " + (sumar1/contadorDeSecuencias));
        }
    }

    public static int sumar(int [] arregloA1,int ini, int fin){
        int acumulador = 0;
        for (int i = ini; i < fin; i++) {
            acumulador+=arregloA1[i];
        }
        return acumulador;
    }
}

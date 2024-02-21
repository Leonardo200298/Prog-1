package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_22 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        /* 22. Hacer un programa que reemplace de un arreglo A todas las
        ocurrencias de una secuencia patrón dada en un arreglo P, por la
        secuencia contenida en el arreglo R de igual tamaño. */
        int [] A = {0,5,4,8,0,1,0,0,1,2,3,0,9,1,2,2,0,4,0,0};  
        int [] P = {0,0,0,0,0,1,2,3,0,0,0,0,0,0,0,0,0,0,0,0};  
        int [] R = {0,0,0,0,0,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0};     

        imprimirArreglo(A);
        intercambiarEnASecuenciaDePIncluidaEnR(A,P,R);
        imprimirArreglo(A);
    }

    public static void intercambiarEnASecuenciaDePIncluidaEnR(int[] arregloA, int[] arregloP, int[] arregloR) {
        int finA = 0;
        int iniA = buscar_inicio(arregloA, finA);
        int finP = 0;
        int iniP = buscar_inicio(arregloP, finP);
        finP = buscar_fin(arregloP, iniP);
        int finR = 0;
        int iniR = buscar_inicio(arregloR, finR);
        finR = buscar_fin(arregloR, iniR);
        while (iniA < MAX) {
            finA = buscar_fin(arregloA, iniA);
            if (iniA < MAX) {
                /*fijarme si una secuencia de P esta en A si es asi
                reemplazarla por la secuencia de R
                 */
            }
            iniA = buscar_inicio(arregloA, finA + 1);
        }
    }

    public static int buscar_fin(int[] arregloA, int iniA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar_fin'");
    }

    public static int buscar_inicio(int[] arregloA, int finA) {
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

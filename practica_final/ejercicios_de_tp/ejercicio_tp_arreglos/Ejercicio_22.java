package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_22 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args) {
        /* 22. Hacer un programa que reemplace de un arreglo A todas las
        ocurrencias de una secuencia patrón dada en un arreglo P, por la
        secuencia contenida en el arreglo R de igual tamaño. */
        int [] A = {0,5,4,8,0,1,0,0,1,2,3,0,9,1,2,2,0,4,0,0};  
        int [] P = {0,0,0,0,0,1,2,3,0,0,0,0,0,0,0,0,0,0,0,0};  
        int [] R = {0,0,0,0,0,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0};     

        imprimirArreglo(A);
        intercambiarEnASecuenciaDePIncluidaEnR(A,P,R);
        System.out.println("------------------");
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
                if (finA - iniA + 1 == finP - iniP + 1 && secuenciasIguales(arregloA,arregloP,iniA,finA,iniP,finP)) {
                    corrimiento_a_derecha(arregloA,iniA,finA);
                    for (int i = iniA; i <= finA; i++) {
                        for (int j = iniR; j <= finR; j++) {
                            arregloA[i] = arregloR[j];
                        }
                    }
                }
            }
            iniA = buscar_inicio(arregloA, finA + 1);
        }
    }

    public static void corrimiento_a_derecha(int[] arregloA, int iniA, int finA) {
        for (int i = finA; i >= iniA; i--) {
            arregloA[i] = arregloA[i - 1];
        }
    }

    public static boolean secuenciasIguales(int[] arregloA, int[] arregloP, int iniA, int finA, int iniP, int finP) {
        boolean flag = false;
        while ((iniA <= finA && iniP <= finP) && (arregloA[iniA] == arregloP[iniP])) {
            iniA++;
            iniP++;
            flag = true;
        }
        return flag;
    }

    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini < MAX && arreglo[ini] != SEPARADOR) {
            ini ++;
        }
        return ini - 1;
    }

    public static int buscar_inicio(int[] arreglo, int fin) {
        while (fin < MAX && arreglo[fin] == SEPARADOR) {
            fin ++;
        }
       return fin;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}

public class PrefinalProg2024 {
    public static final int SEPARADOR = 0;
    public static final int X = 600;
    public static final int M = 15;
    public static final int N = 3;

    public static void main(String[] args) {
        int[][] matVentas = {
            { 0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0 },
            { 0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0 },
            { 0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0 }
        };
        int[] A1 = { 1, 2, 0 };
        int[] A2 = { 3, 0, 0 };
        recorrer_por_mes(matVentas, A1, A2);
    }

    public static void recorrer_por_mes(int[][] matrizv, int[] arr1, int[] arr2) {
        for (int i = 0; i < N; i++) {
            if (arr1[i] != SEPARADOR) {
                int resultado = calcular_promedio_mayores(matrizv[arr1[i] - 1]);
                System.out.println("El promedio de mayores ventas para el mes " + arr1[i] + " es: " + resultado);
            }
            if (arr2[i] != SEPARADOR) {
                boolean resultado = promedio_superior_a_x(matrizv[arr2[i] - 1], X);
                if (resultado) {
                    System.out.println("El promedio diario de ventas para el mes " + arr2[i] + " fue superior a " + X);
                } else {
                    System.out.println("El promedio diario de ventas para el mes " + arr2[i] + " NO fue superior a " + X);
                }
            }
        }
    }

    public static int calcular_promedio_mayores(int[] arrDeA) {
        int contadorDeSecuencias = 0;
        int fin = 0;
        int ini = buscar_ini(arrDeA, fin);
        int acumuladorDeMayores = 0;
        while (ini < M) {
            fin = buscar_fin(arrDeA, ini);
            if (ini < M) {
                acumuladorDeMayores += acumularDiaMayorGanancia(arrDeA, ini, fin);
                contadorDeSecuencias++;
            }
            ini = buscar_ini(arrDeA, fin + 1);
        }
        return acumuladorDeMayores / contadorDeSecuencias;
    }

    public static boolean promedio_superior_a_x(int[] arrDeA, int x) {
        int contadorDeSecuencias = 0;
        int fin = 0;
        int ini = buscar_ini(arrDeA, fin);
        int acumuladorDeVentas = 0;
        while (ini < M) {
            fin = buscar_fin(arrDeA, ini);
            if (ini < M) {
                acumuladorDeVentas += sumar(arrDeA, ini, fin + 1);
                contadorDeSecuencias++;
            }
            ini = buscar_ini(arrDeA, fin + 1);
        }
        return (acumuladorDeVentas / contadorDeSecuencias) > x;
    }

    public static int acumularDiaMayorGanancia(int[] arrDeA, int ini, int fin) {
        int numMayor = 0;
        for (int i = ini; i <= fin; i++) {
            if (arrDeA[i] > numMayor) {
                numMayor = arrDeA[i];
            }
        }
        return numMayor;
    }

    public static int sumar(int[] arregloA1, int ini, int fin) {
        int acumulador = 0;
        for (int i = ini; i < fin; i++) {
            acumulador += arregloA1[i];
        }
        return acumulador;
    }

    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini < M && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }

    public static int buscar_ini(int[] arreglo, int fin) {
        while (fin < M && arreglo[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }
}

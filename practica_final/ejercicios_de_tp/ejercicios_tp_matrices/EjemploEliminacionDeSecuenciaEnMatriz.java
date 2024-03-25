package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

public class EjemploEliminacionDeSecuenciaEnMatriz {
    public final static int N = 4;
    public final static int M = 16;
    public final static int SEPARADOR = 0;
    public final static int TOPE = 2;
    public static void main(String[] args) {
        int[][] matint = {
            { 0, 2, 1, 8, 0, 0, 9, 0, 0, 7, 4, 1, 0, 1, 0, 0 },
            { 0, 1, 1, 0, 3, 0, 9, 2, 0, 1, 4, 0, 0, 1, 0, 0 },
            { 0, 2, 0, 9, 0, 5, 9, 0, 0, 9, 4, 1, 3, 1, 0, 0 },
            { 0, 2, 2, 1, 0, 5, 3, 2, 0, 9, 4, 0, 3, 8, 0, 0 } };
            mostrar(matint);
            recorrer_matriz(matint);
            System.out.println("----------------");
            mostrar(matint);
    }

    public static void recorrer_matriz(int[][] matint) {
        for (int fila = 0; fila < N; fila++) {
            buscar_secuencia_mayor(matint[fila]);
        }
    }

    public static void buscar_secuencia_mayor(int[] arreglo) {
        int fin = 0;
        int longitud = 0;
        int ini = buscar_ini(arreglo, fin);
        while (ini < M) {
            fin = buscar_fin(arreglo, ini);
            if (ini < M) {
                longitud = fin - ini + 1;
                if (longitud > TOPE) {
                    eliminar_secuencia(arreglo, ini, fin);
                }
            }
            ini = buscar_ini(arreglo, fin + 1);
        }
    }

    public static void eliminar_secuencia(int[] arreglo, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_izq(arreglo,ini);
        }
    }

    public static void corrimiento_izq(int[] arreglo, int ini) {
    	for (int i = ini; i < M - 1; i++) {
			arreglo[i] = arreglo[i + 1];
		}
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

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(matriz[i][j] + "|");
            System.out.println();
        }
    }
}

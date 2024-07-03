public class Recuperatorio2024 {
    final static int N = 3;
    final static int M = 20;
    final static int MAXB = 3;

    public static void main(String[] args) {
        char[][] matrizV = {
                { 'x', 't', 'a', 'C', 'M', 'O', 't', 'a', 'a', 't', 'O', 'C', 't', 't', 'a', 'O', 'M', 'C', 't', 'x' },
                { 'x', 'r', 'r', 'r', 'C', 'C', 'O', 'O', 'r', 'r', 'C', 'r', 'r', 'G', 'G', 'G', 'r', 'x', 'x', 'x' },
                { 'x', 'm', 'G', 'm', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x',
                        'x' } };

        char[] arregloB = { 'C', 'O', 'L' };

        int R = 2;

        mostrar(matrizV);
        aplicarLaser(matrizV, arregloB, R);
        mostrar(matrizV);
    }

    public static void aplicarLaser(char[][] matrizV, char[] arregloB, int r) {
        int contMalezasEliminadas = 0;
        for (int i = 0; i < N; i++) {
            contMalezasEliminadas += aplicarLaserASurco(matrizV[i], arregloB, r);
        }
        System.out.println("La cantidad total de malezas eliminadas fue " + contMalezasEliminadas);
    }

    public static int aplicarLaserASurco(char[] surco, char[] arregloB, int r) {
        int ini = 0;
        int fin = -1;
        int contadorMalezas = 0;
        int cantidad;
        while (ini < M) {
            ini = buscarInicio(surco, fin + 1);
            if (ini < M) {
                fin = buscarFin(surco, ini);
                if (fin - ini + 1 > r) {
                    cantidad = eliminarMalezas(surco, ini, fin, arregloB);
                    fin = fin - cantidad;
                    contadorMalezas += cantidad;
                }
            }
        }

        return contadorMalezas;
    }
    public static int eliminarMalezas(char[] surco, int ini, int fin, char[] arregloB) {
        int contador = 0;
        while (ini <= fin) {
            if (esBeneficiosa(surco[ini], arregloB)) {
                ini++;
            } else {
                correrAIzquierda(surco, ini);
                fin--;
                contador++;
            }
        }
        return contador;
    }   
    public static boolean esBeneficiosa(char c, char[] arregloB) {
        int i = 0;
        boolean encontrado = false; 
        while (i < MAXB && !encontrado) {
            if (c == arregloB[i]) {
                encontrado = true;  
            }
            i++;
        } 
        return encontrado; 
    }
    public static void correrAIzquierda(char[] arr, int pos) {
        for (int i = pos; i < M - 1; i++)
            arr[i] = arr[i + 1];
    }

    public static int buscarInicio(char[] arr, int pos) {
        while (pos < M && esMinuscula(arr[pos]))
            pos++;
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < M && !esMinuscula(arr[pos]))
            pos++;
        return pos - 1;
    }

    public static boolean esMinuscula(char caracter) {
        return 'a' <= caracter && caracter <= 'z';
    }

    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(matriz[i][j] + " | ");
            System.out.println();
        }
    }
}

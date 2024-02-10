package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_17 {
    public static final int MAX = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;

	public static void main(String[] args) {
		int arreglo[] = new int[MAX];
		cargarSecuenciasInt(arreglo);
		imprimirArreglo(arreglo);
		InicioAnteUltimaSecuencia(arreglo);
	}

	public static void InicioAnteUltimaSecuencia(int[] arreglo) {
		int fin2;
		int inicio2;
		int inicio = (MAX - 1);
		int fin1;
		int inicio1;

		fin2 = buscarFin(arreglo, inicio);
		inicio2 = buscarInicio(arreglo, fin2);
		fin1 = buscarFin(arreglo, inicio2);
		inicio1 = buscarInicio(arreglo, fin1);
		System.out.println("El inicio de la ante ultima secuencia es: " + (inicio1 + 1) + " y el fin es "
        + fin1
        );
	}

	public static int buscarInicio(int[] arr, int pos) {
		int i = pos;
		while ((pos > 0 )&&(arr[i] != 0)) {
			i--;

		}

		return i;
	}

	public static int buscarFin(int[] arr, int pos) {
		int i = pos;
		while ((pos > 0 )&&(arr[i] == 0)) {
			i--;
			
		}
		return i;
	}

	public static void cargarSecuenciasInt(int[] arr) {
		Random r = new Random();
		arr[0] = 0;
		arr[MAX - 1] = 0;
		for (int pos = 1; pos < MAX - 1; pos++) {
			if (r.nextDouble() > PROBABILIDAD_NUMERO) {
				arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
			} else {
				arr[pos] = 0;
			}
		}
	}

	public static void imprimirArreglo(int[] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.print("[" + arr[pos] + "]");
		}
		System.out.println("");
	}
}

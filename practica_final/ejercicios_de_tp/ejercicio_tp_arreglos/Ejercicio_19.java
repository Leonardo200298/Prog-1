package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_19 {
	public static final int MAX = 20;
	public static final int SEPARADOR = 0;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;

	public static void main(String[] args) {
		/*
		 * Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
		 * el caso de eliminar secuencias se debe hacer corrimiento.
		 * 19. Hacer un programa que dado un número N ingresado por el
		 * usuario, elimine las secuencias de tamaño N de números distintos
		 * de cero.
		 */
		int num;
		int arreglo[] = new int[MAX];
		cargarSecuenciasInt(arreglo);
		imprimirArreglo(arreglo);
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese longitud de secuencia: ");
			num = Integer.valueOf(entrada.readLine());
			eliminar_secuencia_distinta_N(arreglo, num);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		imprimirArreglo(arreglo);
	}

	public static void eliminar_secuencia_distinta_N(int[] arreglo, int num) {
		int fin = 0;
		int ini = buscar_inicio(arreglo, fin);
		while (ini < MAX) {
			fin = buscar_fin(arreglo, ini);
			if (ini < MAX) {
				int longitud = fin - ini + 1;
				if (num == longitud) {
					for (int i = ini; i <= fin; i++) {
						corrimiento_a_izquierda(arreglo, ini, fin);

					}
				}
			}
			ini = buscar_inicio(arreglo, fin + 1);
		}
	}

	public static void corrimiento_a_izquierda(int[] arreglo, int ini, int fin) {
		for (int i = ini; i <= fin; i++) {
			arreglo[i] = arreglo[i + 1];
		}
	}

	public static int buscar_inicio(int[] arreglo, int fin) {
		while (fin < MAX && arreglo[fin] == SEPARADOR) {
			fin++;
		}
		return fin;
	}

	public static int buscar_fin(int[] arreglo, int ini) {
		while (ini < MAX && arreglo[ini] != SEPARADOR) {
			ini++;
		}
		return ini - 1;
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

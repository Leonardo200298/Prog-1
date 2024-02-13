package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_19 {
    public static final int MAX = 20;
	public static final int SEPARADOR = 0;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;
    public static void main(String[] args) {
        /* 
        Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
        el caso de eliminar secuencias se debe hacer corrimiento.
        19. Hacer un programa que dado un número N ingresado por el
        usuario, elimine las secuencias de tamaño N de números distintos
        de cero. */
        int arreglo[] = new int[MAX];
		cargarSecuenciasInt(arreglo);
		imprimirArreglo(arreglo);
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

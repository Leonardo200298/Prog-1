import java.util.Random;

public class ejercicio11practico7 {
    public static final int MAX = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_numero = 0.4;

	public static void main(String [] args) {
		int [] arrInt = new int [MAX];

		cargar_arreglo_aleatorio_secuencias_int(arrInt);
		imprimir_arreglo_secuencias_int(arrInt);
		busca_mayor_secuencia(arrInt);
	}

	//carga arreglo de secuencias
	public static void cargar_arreglo_aleatorio_secuencias_int(int []
			arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}

	//imprimime arreglo de secuencias
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}

	//busca inicio de la secuencia
	public static int busca_inicio(int [] arr, int fin) {
		int i=fin;
		while((i < MAX)&& (arr[i] == 0)){
			i++;
		}
		if(i<MAX) {
			return i;
		}else {
			return -1;
		}
	
	}

	//busco fin
	public static int busca_fin(int [] arr, int inicio) {
		int i = inicio;

		while((i<MAX)&&(arr[i] != 0)) {
			i++;
		}
		
		if(i<MAX) {
			return i-1;
		}else {
			return -1;
		}
		
	}

	//suma secuencia
	public static int suma_secuencia(int [] arr, int inicio, int fin) {
		int suma=0;
		for(int i = inicio; i<= fin ; i++) {
			suma+= arr[i];
		}
		return suma;
	}

	//busca la secuencia con mayor valor
	public static void busca_mayor_secuencia(int [] arr) {
		int sumaMayor =0;
		int suma=0;
		int finM=0;
		int inicioM =0;

		int fin = 0;
		int inicio = busca_inicio(arr, fin);

		while(inicio != -1) {
			fin = busca_fin(arr, inicio);

			if(fin != -1) {
				suma = suma_secuencia(arr, inicio,fin);

				if(sumaMayor <suma) {
					sumaMayor = suma;
					finM= fin;
					inicioM = inicio;
				}
				inicio = busca_inicio(arr, fin+1);
			}
		}
		System.out.println("La secuencia con mayor suma se encuentra entre la posicion: "+inicioM+ " y  "+finM + " y suma "+ sumaMayor);
	}
}

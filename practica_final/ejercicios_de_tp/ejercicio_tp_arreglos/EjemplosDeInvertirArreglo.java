package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class EjemplosDeInvertirArreglo {
    public static final int MAX = 5;

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 5, 1, 5 };
        System.out.println("----------arreglo----------");
        mostrar(arreglo);
       /*  System.out.println("-----------mostrar arreglo con solucion catedra-----------");
        invetirArregloSolucionCatedra(arreglo);
        mostrar(arreglo); */
        System.out.println("-----------mostrar arreglo con solucion mia-----------");
        invertirArregloSolucionMia(arreglo);
        mostrar(arreglo);
    }

    public static void invertirArregloSolucionMia(int[] arreglo) {
        int pos = 0;
        int temporal;
        while (pos < (MAX - 1) / 2) {
            temporal = arreglo[MAX - 1 - pos];
            arreglo[MAX - 1 - pos] = arreglo[pos];
            arreglo[pos] = temporal;
            pos ++;
        }
    }

    public static void invetirArregloSolucionCatedra(int[] arr) {
        int aux;
        int ini = 0;
        int fin = MAX - 1;
        while (ini < fin) {
            aux = arr[ini];
            arr[ini] = arr[fin];
            arr[fin] = aux;
            ini++;
            fin--;
            System.out.println("Esto es ini " + ini);
            System.out.println("Esto es fin " + fin);
        }
    }

    public static void mostrar(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arreglo[pos] + "]");
        }
        System.out.println("");
    }
}

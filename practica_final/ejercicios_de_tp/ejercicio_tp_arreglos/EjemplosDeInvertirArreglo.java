package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class EjemplosDeInvertirArreglo {
    public static final int MAX = 5;
    public static void main(String[] args) {
        int []arreglo = {1,2,5,1,5};
        System.out.println("-----------mostrar arreglo con solucion catedra-----------");
        invetirArregloSolucionCatedra(arreglo);
        mostrar(arreglo);
        System.out.println("-----------mostrar arreglo con solucion mia-----------");
        invertirArregloSolucionMia(arreglo);
        mostrar(arreglo);
    }

    public static void invertirArregloSolucionMia(int[] arreglo) {
        int pos = 0;
        int temporal;
        while (pos < MAX/2) {
            temporal = arreglo[MAX - 1 - pos];
        }
    }
    
    
    public static void invetirArregloSolucionCatedra(int[] arreglo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'invetirArregloSolucionCatedra'");
    }

    public static void mostrar(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arreglo[pos] + "]");
        }
        System.out.println("");
    }
}

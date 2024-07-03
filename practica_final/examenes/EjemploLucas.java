public class EjemploLucas {
    public static final int MAX = 25;
    public static final int SEPARADOR = 0;
    public static final int PRODUCTO = 22;
    public static final int MAXB = 2;
    public static void main(String[] args) {
        int [] arrayA = {0,0,12,9,18,0,15,5,4,7,10,0,8,9,12,0,19,10,9,0,0,0,0,0,0};   
        int [] arrayB = {8,9};
        int ini = 0;
        int fin = -1;
        imprimir_arreglo_int(arrayA);
        while (ini < MAX) {
            ini = buscar_ini(arrayA, fin + 1);
            if (ini < MAX) {
                fin = buscar_fin(arrayA, ini);
                if (sonIguales(arrayA,arrayB,ini,fin)) {
                    eliminar_secuencia(arrayA,ini,fin);
                    fin = ini;
                }
             
            }
             // aca si buscas el inicio de la nueva secuencia y la anterior se
                                                // eliminó debes tener otro fin no el anterior.
        }
                                            
        imprimir_arreglo_int(arrayA);
    }
    public static void imprimir_arreglo_int(int[] arrayA) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arrayA[pos]);
        }
    }
    public static void eliminar_secuencia(int[] arrayA, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_izq(arrayA, ini);

        }
    }
    public static void corrimiento_izq(int[] arrayA, int ini) {
        for (int i = ini; i < MAX - 1; i++) {
            arrayA[i] = arrayA[i + 1];
        }
    }
    public static boolean sonIguales(int[] arrayA, int[] arrayB, int ini, int fin) {
        boolean sonIguales = false;
        while (ini < fin && !existe(arrayB,arrayA[ini])) {
            ini++;
            sonIguales = true;
        }
        return sonIguales;
    }
    public static boolean existe(int[] arrayB,int valor) {
        int ite = 0;
        boolean sonIguales = false;
        while (ite < MAXB && !sonIguales) {
            if (arrayB[ite] != valor) {
                sonIguales = true;
                
            }
            ite++;
        }
        return sonIguales;
    }
    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini < MAX && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }

    public static int buscar_ini(int[] arreglo, int fin) {
        while (fin < MAX && arreglo[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }
}

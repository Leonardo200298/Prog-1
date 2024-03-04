package practica_final.examenes;

public class PrefinalAnioPasado {
    public final static int N = 4;
    public final static int M = 16;
    public final static char SEPARADOR = ' ';
    public static void main(String[] args) {
        /*
         * El servicio de inteligencia secreto MD5 desea implementar un sistema de
         * encriptación de documentos
         * ultrasecretos. Dichos documentos son almacenados en matrices de caracteres en
         * donde cada fila representa
         * un renglón del mismo. Todos los renglones tienen M caracteres y comienzan y
         * terminan con uno o más
         * espacios.
         * Se desea principalmente encriptar los nombres propios (comienzan con
         * mayúscula) que aparezcan en el
         * documento, ya que seguramente harán referencia a información sensible como
         * ciudades, espías propios o
         * agentes enemigos. El mecanismo de encriptación consiste en realizar una
         * simple inversión de los caracteres
         * y la duplicación de las vocales minúsculas sólo de los nombres propios
         * (secuencias) presentes en el
         * documento. Se pide (a) implementar el mecanismo de encriptación antes
         * descrito sobre una matriz de NxM e
         * (b) informar, al finalizar la ejecución del mismo, la cantidad de secuencias
         * encriptadas.
         * 
         * 
         * Puede asumir que hay espacio suficiente para incorporar los caracteres que
         * deba. El ejemplo es meramente
         * ilustrativo y para que sea más fácil la interpretación del enunciado. El
         * programa realizado en JAVA
         * debe ser flexible para procesar cualquier matriz de NxM.
         * 
         * 
         */
        char[][] documento = {
                { ' ', 'e', 'l', ' ', 'a', 'g', 'e', 'n', 't', 'e', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', 'J', 'a', 'm', 'e', 's', ' ', 'B', 'o', ' ', 's', 'e', ' ', ' ', ' ', ' ' },
                { ' ', 'e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', ' ', 'e', 'n', ' ', ' ', ' ' },
                { ' ', 'C', 'o', 'l', 'o', 'n', 'i', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        mostrar(documento);
        recorrer_secuencias_encriptadas(documento);
        mostrar(documento);
    }

    public static void recorrer_secuencias_encriptadas(char[][] documento) {
        int cantSecuenciasEncriptadas = 0;
        for (int fila = 0; fila < N; fila++) {
            cantSecuenciasEncriptadas += salto_en_secuencias_encriptadas(documento[fila]);
        }
        System.out.println("La cantidad de secuencias encriptadas es: " + cantSecuenciasEncriptadas);
    }

    public static int salto_en_secuencias_encriptadas(char[] arregloDocumento) {
        int contadorDeSecuenciasEncriptadas = 0;
        int fin = 0;
        int ini = buscar_inicio(arregloDocumento, fin);
        while (ini < M) {
            fin = buscar_fin(arregloDocumento, ini);
            if (ini < M) {
                if (esNombrePropio(arregloDocumento[ini])) {
                    
                
                    /* duplicar_consonantes(arregloDocumento, ini, fin); */
                    invertirDocumento(arregloDocumento,ini,fin);
                    duplicarConsonantes(arregloDocumento, ini, fin, arregloDocumento[ini]);
                    
                    contadorDeSecuenciasEncriptadas++;
                }
            }
            ini = buscar_inicio(arregloDocumento, fin + 1);
        }
        return contadorDeSecuenciasEncriptadas;
    }

    public static void duplicarConsonantes(char[] arregloDocumento, int ini, int fin, char consonante) {
        while (ini <= fin) {
            if (!esVocal(arregloDocumento[ini])) {
                corrimiento_derecha(arregloDocumento, ini);
                ini++;
                fin++;
            }
            ini++;
        }

    } 
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void corrimiento_derecha(char[] arregloDocumento, int ini) {
        for (int pos = M - 1; pos > ini; pos--){
            arregloDocumento[pos] = arregloDocumento[pos - 1];
        }
    } 

  

    public static void invertirDocumento(char[] arregloDocumento, int ini, int fin) {

        char temporal;
        while (ini < fin) {
            temporal = arregloDocumento[fin];
            arregloDocumento[fin] = arregloDocumento[ini];
            arregloDocumento[ini] = temporal;
            ini++;
            fin--;
        }


        
    }


    public static boolean esNombrePropio(char consonanteMayuscula) {
        return 'A' <= consonanteMayuscula && consonanteMayuscula <= 'Z';
    }
    public static int buscar_fin(char[] arregloDocumento, int ini) {
        while (ini < M && arregloDocumento[ini] != SEPARADOR) {
            ini ++;
        }
        return ini - 1;
    }

    public static int buscar_inicio(char[] arregloDocumento, int fin) {
        while (fin < M && arregloDocumento[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }

    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(matriz[i][j] + "|");
            System.out.println();
        }
    }
}

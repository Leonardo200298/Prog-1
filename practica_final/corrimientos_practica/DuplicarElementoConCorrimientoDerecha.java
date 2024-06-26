package practica_final.corrimientos_practica;

public class DuplicarElementoConCorrimientoDerecha {
    public static final int MAX = 15;

    public static void main(String[] args) {
        char[] arrChar = { 'A', 'C', 'A', 'A', 'C', 'T', 'A', 'A', 'A', 'C', 'A', 'T', 'A', 'C', 'A' };
        mostrar(arrChar);
        int posC = encuentra_C(arrChar);
        System.out.println("poses: " + posC);

        while (posC < MAX && arrChar[posC] != 'C') {
            corrimiento_derecha(arrChar, posC);
            posC++;
        }
        
        posC = encuentra_C(arrChar);
        mostrar(arrChar);
      
    }

    public static void corrimiento_derecha(char[] arrChar, int posC) {
        int pos = MAX - 1;
        while (pos > posC){
            arrChar[pos] = arrChar[pos - 1];
            pos --;
        }
    }

    public static int encuentra_C(char[] arrChar) {
        int pos = 0;
        while (pos < MAX - 1 && arrChar[pos] != 'c') {
            pos++;
        }
        return pos;
     /*    for (int i = 0; i < MAX - 1; i++) {
            if (arrChar[i] == 'C') {
               
                pos = i;
                
            }
        }
        return pos; */
    }

    public static void mostrar(char[] arrChar) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("[ " + arrChar[i] + " ]");
        }
        System.out.println("");
    }
}

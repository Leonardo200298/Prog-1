import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejericio6practico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario ingrese un caracter letra
         * minúscula, acumule la cantidad de vocales que ingreso. Finalmente
         * muestre por pantalla dicha cantidad.
         */
        char letraMinuscula;
        int acumulador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una letra minuscula");
            letraMinuscula = entrada.readLine().charAt(0);
            while ((letraMinuscula <= 'z') && (letraMinuscula >= 'a')) {
                if ((letraMinuscula == 'a') || (letraMinuscula == 'e') || (letraMinuscula == 'i')
                        || (letraMinuscula == 'o') || (letraMinuscula == 'u')) {
                    acumulador++;
                }
                System.out.println("Ingrese una letra minuscula");
                letraMinuscula = entrada.readLine().charAt(0);
            }
            System.out.println("El numero de vocales minusculas es " + acumulador);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}

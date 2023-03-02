package practico4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5pratico4 {
    public static void main(String[] args) {
        /*
         * Hacer un programa que solicite la carga desde consola de
         * un carácter y realice: imprima si es dígito, o letra minúscula, o
         * es cualquier otro carácter. Si es letra minúscula indicar si es
         * vocal o consonante.
         */
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            if ((caracter>='0') && (caracter<='9')) {
                System.out.println("El valor " + caracter + " es digito");
            } else if ((caracter>='a') && (caracter<='z')){
                System.out.println("Es letra minuscula");
                if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
                    System.out.println("Es vocal");
                }else{
                    System.out.println("Es consonante");
                }
            }else{
                System.out.println("Es otro caracter");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}

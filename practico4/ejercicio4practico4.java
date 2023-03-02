package practico4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4practico4 {
    public static void main(String[] args) {
        /*
         * Hacer un programa que solicite la carga desde consola de un
         * numero entero y realice:
         * _si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
         * es menor. Además deberá imprimir que el valor es positivo.
         * _si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
         * ninguna de las opciones anteriores.
         */
        int numeroIntirow;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero: ");
            numeroIntirow = Integer.valueOf(entrada.readLine());
            if (numeroIntirow>0) {
                if (numeroIntirow > 100) {
                    System.out.println("Grande");
                }else{
                    System.out.println("Chico");
                }
                System.out.println("El valor "+ numeroIntirow + " es positivo");
            }else{
                if ((numeroIntirow%2)==0) {
                    System.out.println("Es par");
                } else if ((numeroIntirow%3)==0){
                    System.out.println("Es multiplo de 3");
                }else{
                    System.out.println("No es ninguna de las opciones anteriores");
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}

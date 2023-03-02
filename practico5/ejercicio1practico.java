import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1practico {
    public static void main (String [] args){
        /*
         * Escribir un programa que mientras el usuario ingrese un número entero
         * menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
         * 2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
         * enunciado deberían ser constantes?. De a poco habría que definirlos
         * como constantes).
         */
        final int MIN = 1;
        final int MAX = 10;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Escribe un numero del 1 al 10");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero<=MAX)&&(numero>=MIN)) {
                if (((numero%2)==0) && ((numero%3)==0)) {
                    System.out.println("El numero es multiplo de dos y tres");
                }else{
                   System.out.println("No es multiplo de dos ni de tres");
                }
                System.out.println("Escribe un numero del 1 al 10");
                numero = Integer.valueOf(entrada.readLine());
            }
     

        }catch(Exception exc){

        }


    }
}

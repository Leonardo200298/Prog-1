package practico4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2practico4 {
    public static void main (String [] args){
        /*
         * Escribir un programa que permita el ingreso de dos números enteros
         * por teclado y realice:
         * imprima A si el primero mayor al segundo,
         * o imprima B si ambos son múltiplos de 2,
         * _ o imprima C para ninguna de las opciones anteriores
         */
        int valorUno;
        int valorDos;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            valorUno = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero entero");
            valorDos = Integer.valueOf(entrada.readLine());
            if (valorUno>valorDos){
                System.out.println("A");
            }else if (((valorUno%2)==0) && ((valorDos%2)==0)){
                System.out.println("B");
            }else{
                System.out.println("C");
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}

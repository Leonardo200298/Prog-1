package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3practico3 {
    public static void main(String[] args) {
        /*
         * 3. Escribir un programa que permita el ingreso de dos números enteros por
         * teclado e imprima los resultados de comparar:
         * el primero mayor al segundo.
         * ambos son múltiplos de 2.
         */
        int valor1;
        int valor2;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el valor uno");
            valor1=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el valor dos");
            valor2=Integer.valueOf(entrada.readLine());
            System.out.println(valor1>valor2);
            System.out.println(((valor1%2)==0)&&((valor2%2)==0));
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}

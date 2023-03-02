package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejericio1practico3 {
    public static void main(String[] args) {
        /*
         * 1-Escribir un programa que permita el ingreso de un número entero por
         * teclado e imprima el cociente de la división de dicho número con el
         * número 2, luego con el número 3, y finalmente con el número 4.
         */
        int interoChe;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero: ");
            interoChe = Integer.valueOf(entrada.readLine());
            
            System.out.println("El cociente de "+interoChe+" es " + (interoChe%2==0));
            System.out.println("El cociente de "+interoChe+" es " + (interoChe%3==0));
            System.out.println("El cociente de "+interoChe+" es " + (interoChe%4==0));
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
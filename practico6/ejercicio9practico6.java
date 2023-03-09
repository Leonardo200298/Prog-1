package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9practico6 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que dado dos números enteros y un
         * carácter, todos ingresados por el usuario, muestre por
         * pantalla el resultado de la operación matemática básica
         * considerando el valor del carácter. Si ingreso el caracter:
         * – ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
         * entre ambos números.
         */
        char caracter;
        int numero1;
        int numero2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));        
        try {
            System.out.println("Ingrese a,b,c o d");
            caracter = entrada.readLine().charAt(0);
            System.out.println("Ingrese un numero: ");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero: ");
            numero2 = Integer.valueOf(entrada.readLine());
            switch (caracter) {
                case 'a':
                System.out.println("El resultado de " + numero1 + " + " + numero2 + " = " + sumar(numero1,numero2));
                break;
                case 'b':
                System.out.println("El resultado de " + numero1 + " - " + numero2 + " = " + resta(numero1,numero2));
                break;
                case 'c':
                System.out.println("El resultado de " + numero1 + " * " + numero2 + " = " + multiplicar(numero1,numero2));  
                break;
                case 'd':
                System.out.println("El resultado de " + numero1 + " / " + numero2 + " = " + division(numero1,numero2));
                break;
                default:
                System.out.println("Solo se puede hacer operacion tipeando a,b,c o d");
                break;
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }


    public static int sumar(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }



}

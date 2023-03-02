package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4practico6 {
    public static final int MAX = 200;
    public static final int MIN = 1;
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario cargue desde
         * teclado un numero entero distinto de 0, imprima por
         * pantalla la suma que se obtiene de invocar un método
         * que calcula la sumatoria de los primeros 200 números
         * naturales (son números enteros en 1 y 200).
         */
        int numero;
        int total;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero distinto de cero (0 para salir): ");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                total = sumatoria_de_1_y_200();
                System.out.println("La sumatoria total es " + total);
                System.out.println("Ingrese un numero distinto de cero (0 para salir): ");
                numero = Integer.valueOf(entrada.readLine());
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int sumatoria_de_1_y_200(){
        int sum=0;
        int total;
        
        for (int number=MIN;number<=MAX;number++){
            sum+=number;
          }
          total=sum;
          return total;
    }
}

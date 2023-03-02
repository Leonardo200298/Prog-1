package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3pratico2 {
    public static void main(String[] args) throws Exception {
        /*
         * 2. Escribir un programa que solicite los siguientes datos de una persona
         * (nombre,
         * apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.
         */
        String nombre;
        int edad;
        double altura;
        String ocupacion;
        String direccion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("¿Como te llamas?:");
            nombre = entrada.readLine();
            System.out.println("¿Cual es tu edad");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("¿Cual es tu atura");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("¿Cual es su ocupacion?");
            ocupacion = entrada.readLine();
            System.out.println("¿Cual es su direccion?");
            direccion = entrada.readLine();
            System.out.println("Mi nombre es " + nombre);
            System.out.println("Mi edad es " + edad);
            System.out.println("Mi altura es " + altura);
            System.out.println(ocupacion);
            System.out.println(direccion);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
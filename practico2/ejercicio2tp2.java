package practico2;

public class ejercicio2tp2 {
    public static void main(String[] args) throws Exception {
        /*
         * 2. Escribir un programa que declare tres variables de tipo double y
         * una constante de tipo double con valor 1.0 . Luego deberá
         * asignar el valor de la constante a una de la variables declaradas,
         * y posteriormente sobre las dos restantes variables se le deberá
         * asignar el valor de la variable que inicialmente fue seteada con el
         * valor de la constante. Finalmente imprima por pantalla cada una
         * de las variables.
         */
        double var1 = 2.5;
        double var2 = 2.6;
        double var3 = 2.7;
        final double constante = 1.0;
        var1 = constante;
        var2=var1;
        var3=var1;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

}

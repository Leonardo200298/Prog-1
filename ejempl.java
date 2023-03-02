public class ejempl {
    public static void main(String[] args) throws Exception {
       /*Escribir un programa que para los tipos int, double, char y boolean
declare una variable en cada caso, luego asigne un valor a cada
una correspondiente al tipo que la variable tiene, e imprima por
pantalla cada una de las variables.
2. Escribir un programa que declare tres variables de tipo double y
una constante de tipo double con valor 1.0 . Luego deberá
asignar el valor de la constante a una de la variables declaradas,
y posteriormente sobre las dos restantes variables se le deberá
asignar el valor de la variable que inicialmente fue seteada con el
valor de la constante. Finalmente imprima por pantalla cada una
de las variables. */
        int numero;
        double numeroConPunto;
        char signo;
        boolean miento; 
        numero = 5;
        numeroConPunto = 1.0;
        signo = '?';
        miento=false;
        System.out.println( numero);
        System.out.println("El numero es " + numeroConPunto);
        System.out.println("El signo es " + signo);
        System.out.println("boolean "+miento);
        
    }
}
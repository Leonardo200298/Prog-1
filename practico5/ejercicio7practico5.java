import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7practico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario ingrese un caracter letra
         * minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
         * muestre por pantalla dichas letras.
         */
        char lessLetter = 'a';
        char higherLetter='b';
        char letra;
        int character=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{ 
            System.out.println("Ingrese letras:");
              letra = entrada.readLine().charAt(0);
          while ((letra <= 'z') && (letra >= 'a')){
              if (letra < character){
              lessLetter=letra;
              character++;
            }else{
              higherLetter=letra;
              
              character++;
            }
            System.out.println("La letra más chica es: "+lessLetter);
            System.out.println("La letra mas grande es: "+higherLetter);
          }
          //System.out.println("Vocales acumuladas en total: " + acummulator);
        }catch (Exception exc){
          System.out.println(exc);
        }
    }
}

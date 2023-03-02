package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3tp2 {
    public static void main(String[] args) {
        /*
         * 3. Escribir un programa que pida que se ingresen datos necesarios para emitir
         * una
         * factura por la compra de dos artículos de librería (tipo factura, número,
         * nombre
         * cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
         * salida debe imprimir
         */
        char tipoDeFactura;
        int numero;
        String nombreCliente;
        String producto1;
        double importe1;
        String producto2;
        double importe2;
        /* double importeTotal = imAporte1 + importe2; */
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese tipo de factura");
            tipoDeFactura = entrada.readLine().charAt(0);
            System.out.println("Ingrese el numero de factura");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su nombre");
            nombreCliente = entrada.readLine();
            System.out.println("Ingrese el producto 1");
            producto1 = entrada.readLine();
            System.out.println("Ingrese el importe 1");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto 2");
            producto2 = entrada.readLine();
            System.out.println("Ingrese el importe 2");
            importe2 = Double.valueOf(entrada.readLine());
            System.out.println("Factura"+"\t\t"+tipoDeFactura+"\t\t"+numero);
            System.out.println("\nNombre y Apellido \t\t" + nombreCliente);
            System.out.println("\nProducto \t\t\t\t Importe");
            System.out.println("\n"+producto1+"\t\t\t\t"+importe1);
            System.out.println("\n"+producto2+"\t\t\t\t"+importe2);
            System.out.println("Importe total"+"\t\t\t\t"+(importe1+importe2));

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}

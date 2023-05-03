import java.util.Locale;
import java.util.Scanner;

/*Hacer un algoritmo que imprima el nombre de un artículo,
 clave, precio original y su precio con descuento.
  El descuento lo hace en base a la clave,
   si la clave es 01 el descuento es del 10% y
    si la clave es 02 el descuento en del 20% (solo existen dos claves).*/
public class Ejer7_Condicionales {
    public static void main(String[] args) {

        String articulo;
        double precio, precioConDesc = 0;
        String clave;


        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese nombre de articulo:");
        articulo = entrada.nextLine();

        System.out.println("Ingrese clave 01/02");
        clave = entrada.nextLine();

        System.out.printf("\nIngrese precio de %s:", articulo);
        precio = entrada.nextDouble();


        if (clave.contentEquals("01") ) {
            precioConDesc = precio - (0.10 * precio);
        } else if (clave.contentEquals("02")) {
            precioConDesc = precio - (0.20 * precio);
        }else{
            System.out.println("Numero de clave no disponible");
        }


        if((clave.contentEquals("01")) || (clave.contentEquals("02"))){
            System.out.println("Articulo: "+articulo);
            System.out.println("Precio: "+precio);
            System.out.println("Clave: "+clave);
            System.out.println("Precio con Descuento: "+precioConDesc);
        }

    }
}

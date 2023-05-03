/*Calcula el precio de un boleto de viaje,
 tomando en cuenta el número de kilómetros
 que se van a recorrer, siendo el precio $45 por Km.*/

import java.util.Locale;
import java.util.Scanner;

public class Ejer1_Secuenciales {
    public static void main (String[] args){

        int precio = 45 ; //precio del boleto
        float km;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //permitimos el uso del punto al ingresar el valor km
        System.out.println("Ingrese cantidad de kilometros recorridos: ");
        km = entrada.nextFloat();
        System.out.printf("El precio a pagar del boleto es: %.2f",precio*km);




    }
}

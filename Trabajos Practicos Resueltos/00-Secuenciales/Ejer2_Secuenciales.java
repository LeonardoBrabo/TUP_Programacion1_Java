/*
    Calcula el precio de un boleto de viaje,
     tomando en cuenta el número de kilómetros que se van a recorrer,
      siendo el precio Bs/.10,50 por Km.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejer2_Secuenciales {

    public static void main(String[] args) {

        final float precio = 10.50f;

        float km;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.printf("\nIngrese la cantidad de kilometros recorridos: ");
        km = entrada.nextFloat();

        System.out.printf("\nEl valor del boleto es : $ %.2f",precio*km);
    }



}

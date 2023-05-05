/*En una empresa el valor del pasaje se cobra en función de los destinos.
El destino 1 paga $5.00 y a partir de allí existen 7 destinos más.
Cada destino tiene un costo de 25% más que el anterior.
   Escriba un método que devuelva el valor a pagar en función del número de destino elegido*/

import java.util.Scanner;

public class ValorPasajes {

    public static double valorAPagar (int destino){
        double aPagar = 0; //variable que contendra el precio del destino indicado
        double [] valores = new double[7]; //arreglo que contiene todos los precios de cada destino
        double valorActual = 5.00; //primer valor del destino 1
        double porcentajeSiguiente; // para actualizar el porcentaje del destino siguiente..


        for(int i = 0; i < valores.length;i++){
            valores[i] = valorActual;                   //le asigno el valor del precio del destino
            porcentajeSiguiente = valorActual * 0.25;   // calculo el porcentaje del destino siguiente que se tiene que sumar
            valorActual = valorActual + porcentajeSiguiente; //obtengo el valor que tendrá el destino siguiente.
        }

        aPagar = valores[destino-1]; //sustituye un switch ingresando directamente el destino -1 para obtener la posición.

        return aPagar;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 8; //valor para que entre al bucle; si pongo cero da error por el bloque aPagar = valores[destino-1];
        while(numero < 0 || numero > 7) {
            System.out.println("Ingrese un destino entre 1 a 7 para saber su costo de viaje:");
            numero = entrada.nextInt();

            if(numero < 0 || numero > 7 ) System.out.println("Ingrese solo un valor entre 1 y 7");
        }

        System.out.printf("\nEl total a pagar es: $%.2f",valorAPagar(numero));

    }

}

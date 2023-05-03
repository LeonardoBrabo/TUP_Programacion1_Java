/*Escribir una función que reciba tres puntos en el plano (x1, y1, x2, y2 y x3, y3) e imprima el
área del triángulo correspondiente.*/

// https://www.youtube.com/watch?v=hC2zIrc8Tyo: calculo del area de un triangulo dada sus coordenadas.

import java.util.Scanner;

public class Ejer7_Funciones {

    public static double AreaTriangulo(double x1, double y1 , double x2 , double y2 , double x3, double y3){
        double determinante = ((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1));

        return determinante/2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los 2 puntos del primer par de coordenadas:");
        double a1 = entrada.nextInt();
        double a2 = entrada.nextInt();

        System.out.println("Ingrese los 2 puntos del segundo par de coordenadas:");
        double b1 = entrada.nextInt();
        double b2 = entrada.nextInt();

        System.out.println("Ingrese los 2 puntos del tercer par de coordenadas:");
        double c1 = entrada.nextInt();
        double c2 = entrada.nextInt();

        System.out.println("El area del triangulo es: "+AreaTriangulo(a1,a2,b1,b2,c1,c2));
    }
}

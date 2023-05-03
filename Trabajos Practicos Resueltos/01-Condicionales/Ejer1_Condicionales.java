/*
* Determinar si un alumno aprueba o desaprueba un curso,
 * sabiendo que aprueba si su promedio de tres calificaciones
  * es mayor o igual a 60; desaprueba en caso contrario.
* */

import java.util.Scanner;

public class Ejer1_Condicionales {
    public static void main(String[] args) {

        float c1,c2,c3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las 3 calificaciones del 0-100:");
        c1 = entrada.nextFloat();
        c2 = entrada.nextFloat();
        c3 = entrada.nextFloat();

        float prom = (c1+c2+c3)/3;

        if( prom >= 60){
            System.out.println("su promedio es: "+prom+" Aprobado");
        }else{
            System.out.println("su promedio es: "+prom+" Desaprobado");
        }


    }
}

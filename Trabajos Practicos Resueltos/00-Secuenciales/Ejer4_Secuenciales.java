/*Escriba un algoritmo que dado el número de horas trabajadas por un empleado y el sueldo por hora,
 calcule el sueldo total de ese empleado.
 Tenga en cuenta que las horas extras se pagan el doble.*/

import java.util.Locale;
import java.util.Scanner;

public class Ejer4_Secuenciales {
    public static void main(String[] args){
        float sueldoPorHora, sueldoTotal, horasExtras;
        int horasTrabajadas;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.printf("\nIngrese la cantidad de horas trabajadas por dia: ");
        horasTrabajadas = entrada.nextInt();

        System.out.printf("\nIngrese su sueldo por hora: $");
        sueldoPorHora = entrada.nextFloat();

        sueldoTotal = (horasTrabajadas*sueldoPorHora); //se calcula el sueldo base por dia

        if( horasTrabajadas > 8){

             //se obtiene el doble del precio por las horas extras(+ de 8)
            horasExtras = (horasTrabajadas - 8) * (2 *sueldoPorHora);

            System.out.printf("\n Horas Extras: %d",horasTrabajadas-8);
            System.out.printf("\n Sueldo Base: $ %.2f",sueldoTotal);
            System.out.printf("\n PagoExtra: $ %.2f",horasExtras);
            System.out.printf("\n Sueldo Total: $ %.2f",sueldoTotal+horasExtras);

        }else {
            System.out.printf("\n Sueldo Total: $ %.2f",sueldoTotal);
        }


    }
}

import java.util.Scanner;

/*Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa,
 sabiendo que cuando las horas de trabajo exceden de 40,
  el resto se consideran horas extras y que estas se pagan al doble de una hora normal cuando no exceden de 8;
 si las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que se pagan las horas normales y el resto al triple.*/
public class Ejer9_Condicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double precioPorHora,doble,triple,salarioBase;

        int horasTrabajadas;

        System.out.println("Ingrese el precio por hora:");
        precioPorHora = entrada.nextDouble();

        System.out.println("Ingrese cantidad de horas trabajadas en la semana: ");
        horasTrabajadas = entrada.nextInt();


        if(horasTrabajadas <= 40){

            salarioBase = precioPorHora*horasTrabajadas;
            System.out.println("Su salario es de: "+(salarioBase));

        }else if(horasTrabajadas <= 48){

            salarioBase = precioPorHora*40;
            doble = ((horasTrabajadas-40)*2)*precioPorHora;
            System.out.println("Su salario es de : "+(salarioBase+doble));

        }else{

            salarioBase = precioPorHora*40;
            doble = (8*precioPorHora)*2;
            triple= ((horasTrabajadas-48)*3)*precioPorHora;
            System.out.println("Su salario es de: "+(salarioBase+doble+triple));

        }
    }
}

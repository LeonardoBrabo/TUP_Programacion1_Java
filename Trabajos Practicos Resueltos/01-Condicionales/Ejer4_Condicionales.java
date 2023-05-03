/*Diseñar una solución que permita ingresar tres números enteros, e informe cuál es el mayor.*/
import java.util.Scanner;

public class Ejer4_Condicionales {
    public static void main(String[] args) {

        int n1,n2,n3,mayor;
        mayor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        n1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero:");
        n2 = entrada.nextInt();

        System.out.println("Ingrese tercer numero:");
        n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("El numero mayor es "+n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("El numero mayor es: "+n2);
        }else if ( n3 > n1 && n3 > n2){
            System.out.println("El numero mayor es: "+n3);
        }else{
            System.out.println("los tres números son iguales");
        }







    }
}

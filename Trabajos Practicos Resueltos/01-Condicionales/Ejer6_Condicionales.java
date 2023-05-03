/*Elaborar una solución que permita ingresar un número entero del 1 al 10 y muestre su equivalente en números romanos*/
import java.util.Scanner;
public class Ejer6_Condicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero del 1 al 10:");
        numero = entrada.nextInt();

        switch (numero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("ingrese solo un numero del 1 al 10");
                break;
        }

    }

}

/*Dados los lados de un triángulo, informar qué tipo es: isósceles, escaleno o equilátero.*/
import java.util.Locale;
import java.util.Scanner;

/*Dados los lados de un triángulo, informar qué tipo es: isósceles, escaleno o equilátero.*/
public class Ejer5_Condicionales {
    public static void main(String[] args){

        float lado1,lado2,lado3;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese lado 1 del triangulo:");
        lado1 = entrada.nextFloat();
        System.out.println("Ingrese lado 2 del triangulo:");
        lado2 = entrada.nextFloat();
        System.out.println("Ingrese lado 3 del triangulo:");
        lado3 = entrada.nextFloat();

        if(lado1 == lado2 && lado3 == lado2){
            System.out.println("Triangulo Equilátero");
        }else if((lado1 == lado2) || (lado1 == lado3)  || (lado3 == lado2)){
            System.out.println("Triangulo Isósceles");
        }else{
            System.out.println("Triángulo Escaleno");
        }

    }
}

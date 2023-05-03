import java.util.Locale;
import java.util.Scanner;

/*
* Elabore un programa que realice la conversión de cm. a pulgadas.
a. Donde 1cm = 0.39737 pulgadas
* */
public class Ejer8_Secuenciales {
    public static void main(String[] args) {
        double cm;
        final double pul = 0.393701;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese valor en cm: ");
        cm = entrada.nextDouble();

        System.out.printf("\n CM: %.2f -> Pulgadas : %f",cm,cm*pul);

    }
}

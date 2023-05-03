import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Ejer8_Funciones {

    public static double interesSimple(double c,double x, int n){

        return pow(c*(1+x/100),n);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de pesos:");
        double pesos = entrada.nextDouble();

        System.out.println("Ingrese una tasa de interés:");
        double interes = entrada.nextDouble();

        System.out.println("Ingres el numero de años a calcular:");
        int anios = entrada.nextInt();

        System.out.println("El total a obtener es de: $"+interesSimple(pesos,interes,anios));


    }
}

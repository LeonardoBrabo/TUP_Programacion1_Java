/* Leer dos números y encontrar:
 1- La suma del doble del primero más el cuadrado del segundo
 2- El promedio de sus cubos
* */
import java.util.Locale;
import java.util.Scanner;

public class Ejer5_Secuenciales {
    public static void main(String[] args) {

        float n1,n2;
        double prom,suma;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el primer numero: ");
        n1 = entrada.nextFloat();

        System.out.println("Ingrese el segundo numero: ");
        n2 = entrada.nextFloat();

        suma = (2*n1)+(Math.pow(n2,2));
        prom = (Math.pow(n1,3) + Math.pow(n2,3))/2;

        System.out.println("La suma del doble del primero mas el cuadrado del segundo es: "+suma);
        System.out.println("El promedio de sus cubos es: "+prom);

    }
}

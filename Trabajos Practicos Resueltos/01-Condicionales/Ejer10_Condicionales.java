import java.util.Locale;
import java.util.Scanner;

public class Ejer10_Condicionales {
    public static void main(String[] args) {
        double fianza;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese valor de la fianza: ");
        fianza = entrada.nextDouble();

        if(fianza > 50000) System.out.println("La cuota a pagar es del 3% que es: $"+(fianza*0.03));
        else System.out.println("La cuota a pagar es del 2% que es: $"+(fianza*0.02));


    }
}

/*Una compañía de seguros está abriendo un depto.
 De finanzas y estableció un programa para captar clientes,
 que consiste en lo siguiente:
 Si el monto por el que se efectúa la fianza es menor que $50 000
 la cuota a pagar será por el 3% del monto, y si el monto es mayor que $50 000
  la cuota a pagar será el 2% del monto.
 La compañía desea determinar cuál será la cuota que debe pagar un cliente.*/
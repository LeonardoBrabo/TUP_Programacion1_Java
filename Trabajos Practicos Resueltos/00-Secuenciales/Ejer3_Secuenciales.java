import java.util.Locale;
import java.util.Scanner;

public class Ejer3_Secuenciales {
    public static void main(String[] args) {

        float presupuestoAnual;
        final float urg = 0.37f, pedi = 0.42f, trauma = 0.21f;
        Scanner entrada = new Scanner(System.in);


        System.out.printf("\nIngresa el presupuesto anual $: ");
        entrada.useLocale(Locale.US);
        presupuestoAnual = entrada.nextFloat();

        System.out.printf("\nEl presupuesto de Urgencia es: $ %.2f ",presupuestoAnual*urg);
        System.out.printf("\nEl presupuesto de Pediatria es: $ %.2f ",presupuestoAnual*pedi);
        System.out.printf("\nEl presupuesto de Traumatologia es: $ %.2f ",presupuestoAnual*trauma);


    }


}

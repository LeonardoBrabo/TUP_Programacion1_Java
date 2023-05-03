import java.util.Scanner;

public class Ejer15_Condicionales {
    public static void main(String[] args) {

        double P1,P2,total;
        int N1,N2;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese precio conejos blancos:");
        P1 = ent.nextDouble();
        System.out.println("Ingrese precio conejos negros: ");
        P2 = ent.nextDouble();
        System.out.println("Ingrese cantidad de conejos blancos vendidos: ");
        N1 = ent.nextInt();
        System.out.println("Ingrese cantidad de conejos negros vendidos: ");
        N2 = ent.nextInt();
        total = (P1*N1) + (P2*N2);

        System.out.println("El total de la venta es: $"+total);

        if(N1 > N2) System.out.println("Se vendieron mas conejos de color blanco");
        else if(N1 < N2) System.out.println("Se vendieron mas conejos de color negro");
        else System.out.println("Se vendio la misma cantidad de conejos blancos como negros.");


    }
}

/*En una Granja existen N conejos,
 N1 blancos y N2 negros.
  Suponiendo que P1 es el precio de venta de los conejos blancos y
   P2 es el precio de venta de los conejos negros,
    imprima el monto total de la venta.
     Informe al final el color de los conejos que más se vendieron.*/
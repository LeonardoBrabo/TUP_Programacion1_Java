import java.util.Scanner;

public class Ejer6_Repetitivas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un valor:");
        int nro = entrada.nextInt();

        boolean noPrimo = false;


        for(int i=2; i<=nro/2;i++){ //en la condición dividimos por 2 para acortar el rango de busqueda
            if(nro%i == 0){
                noPrimo = true;
                break; //cuando encuentra un número primo rompe el ciclo y sale.
            }
        }

        if(noPrimo) System.out.println("El numero No es primo");
        else System.out.println("El numero es primo");

    }
}

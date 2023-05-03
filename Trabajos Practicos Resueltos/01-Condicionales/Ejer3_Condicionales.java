import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Solicitar la edad de dos hermanos,
 * mostrando un mensaje que informe la edad
  * del mayor y cuántos años de diferencia
   * tiene con el menor
* */
public class Ejer3_Condicionales {
    public static void main(String[] args) {

        int h1,h2,dif;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese edad del primer hermano: ");
        h1 = entrada.nextInt();

        System.out.println("Ingrese la edad del segundo hermano");
        h2 = entrada.nextInt();

        if(h1 > h2){
            System.out.printf("El mayor tiene %d y tiene %d años de diferencia con el menor",h1,h1-h2);
        }else if( h2 > h1 ){
            System.out.printf("El mayor tiene %d y tiene %d años de diferencia con el menor",h2,h2-h1);
        }else System.out.println("Los dos hermanos tienen la misma edad");


    }
}

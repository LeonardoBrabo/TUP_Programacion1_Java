/*Leer tres números enteros de un Digito y
 almacenarlos en una sola variable que contenga a esos tres dígitos
  Por ejemplo si A=5 y B=6 y C=2 entonces X=562.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejer6_Secuenciales {
    public static void main(String[] args) {
        int A,B,C;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer digito:");
        A = entrada.nextInt();
        System.out.println("Ingrese el segundo digito");
        B = entrada.nextInt();
        System.out.println("Ingrese el tercer digito");
        C = entrada.nextInt();

        String s = ""+ A + B + C;
        System.out.println(s);

    }
}

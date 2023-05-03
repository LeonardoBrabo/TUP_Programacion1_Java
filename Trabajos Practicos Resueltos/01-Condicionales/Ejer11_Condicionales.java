import java.util.Locale;
import java.util.Scanner;

public class Ejer11_Condicionales {
    public static void main(String[] args) {
        int altura;
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        System.out.println("Ingrese altura en centímetros: ");
        altura = ent.nextInt();

        if(altura <= 150) System.out.println("Persona de altura baja");
        else if(altura <= 170) System.out.println("Persona de altura media");
        else System.out.println("Persona alta");

    }
}

/*Se desea escribir un algoritmo que pida la altura de una persona,
 si la altura es menor o igual a 150 cm envíe el mensaje:
  “Persona de altura baja”; si la altura está entre 151 y 170 escriba el mensaje:
   “Persona de altura media” y si la altura es mayor al 171 escriba el mensaje: “Persona alta”.*/

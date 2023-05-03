import java.util.Scanner;

public class Ejer13_Condicionales {
    public static void main(String[] args) {
        int num;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es par: ");
        num = ent.nextInt();

        if(num % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");
    }
}

/*Elabore una solución que solicite el
 ingreso de un número entero distinto de 0 y se informe si es par o no*/
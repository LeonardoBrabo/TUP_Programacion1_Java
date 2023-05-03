import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejer12_Condicionales {
    public static void main(String[] args) {
        int numero;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7:");
        numero = ent.nextInt();

        switch (numero){
            case 1:
                System.out.println("1-Lunes");
                break;
            case 2:
                System.out.println("2-Martes");
                break;
            case 3:
                System.out.println("3-Miércoles");
                break;
            case 4:
                System.out.println("4-Jueves");
                break;
            case 5:
                System.out.println("5-Viernes");
                break;
            case 6:
                System.out.println("6-Sábado");
                break;
            case 7:
                System.out.println("7-Domingo");
                break;
            default:
                System.out.println("No disponible");
        }

    }
}


/*Dado un numero entre 1 y 7 escriba su correspondiente día de la semana así:
1- Lunes 2- Martes 3- Miércoles 4- Jueves 5- Viernes 6- Sábado 7- Domingo*/

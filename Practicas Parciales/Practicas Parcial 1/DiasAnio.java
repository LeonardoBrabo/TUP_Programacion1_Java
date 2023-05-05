import java.util.Scanner;

/*Suponiendo que el primer día del año fue lunes,
 escribir una progama que reciba un número con el día del año (de 1 a 366) y
  retorne el día de la semana que le toca. Por ejemplo: si recibe '3' debe devolver 'miércoles',
  si recibe '9' debe devolver 'martes'.*/
public class DiasAnio {

    public static void main(String[] args) {

        int valorIngresado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero del 1 al 366 para saber que dia le corresponde:");
        valorIngresado = entrada.nextInt();

        int cont = 0;
        int[] dias = {1,2,3,4,5,6,7};
        int dia = 0;
        while(cont != valorIngresado){
            for(int i = 0; i <dias.length; i++){
                cont++;
                if( cont == valorIngresado){
                    dia = dias[i];
                    break; //rompe el for.
                }
            }
        }

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no disponible.");
        }




    }

}

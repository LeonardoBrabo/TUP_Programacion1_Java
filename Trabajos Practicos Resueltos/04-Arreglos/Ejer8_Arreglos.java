import java.util.Scanner;

/*Diseñe un algoritmo que lea un número cualquiera y lo busque en un arreglo X, el cual tiene
almacenado 10 elementos numéricos. Escriba la posición donde se encuentra almacenado el
número en el arreglo o el mensaje “NO” si no lo encuentra.*/
public class Ejer8_Arreglos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] arr = {58,20,12,34,90,1,5,6,79,214};

        boolean encontro = false;

        System.out.println("Ingrese un numero a buscar:");
        int numero = entrada.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == numero) {
                System.out.println("el numero está en la posicion:" + i);
                encontro = true;
                break;
            }
        }

        if(!encontro) System.out.println("No se encuentra en el arreglo.");

    }
}

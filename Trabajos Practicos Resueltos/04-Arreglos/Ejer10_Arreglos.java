import java.util.Scanner;

/*Escriba un algoritmo que lea un arreglo de números enteros, y un número x, y escriba en la
pantalla todos los índices de las posiciones del arreglo donde está x. Por ejemplo, si el arreglo
es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6.*/
public class Ejer10_Arreglos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] arregloEnteros = new int[5];


        for(int i= 0; i < arregloEnteros.length; i++){

            System.out.println("Valor Posicion "+(i)+": ");
            arregloEnteros[i] = entrada.nextInt();
        }

        System.out.println("Ingrese un numero a buscar:");
        int x = entrada.nextInt();

        for(int i = 0; i < arregloEnteros.length; i++){
            if(x == arregloEnteros[i]){
                System.out.println("En la posicion: "+i);
            }
        }
    }
}

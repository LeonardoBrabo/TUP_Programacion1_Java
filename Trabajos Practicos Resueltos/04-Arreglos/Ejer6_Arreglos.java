import java.util.Arrays;
import java.util.Scanner;

/*Escriba un programa que permita cargar 2 arreglos A y B de 10 elementos cada uno, sumar el
elemento en la posición 1 del arreglo A con el elemento en la misma posición del arreglo B y
así sucesivamente. Almacenar el resultado en un arreglo C e imprima el resultado final.*/

public class Ejer6_Arreglos {

    //declaro los arreglos como datos no primitivos globales, para poder llamar al procedimiento de carga.
    static int[] arr1 = new int[10];
    static int[] arr2 = new int[10];
    static Scanner entrada = new Scanner(System.in);

    public static void carga(int[] arreglo){

        for(int i = 0; i < arreglo.length;i++){
            System.out.println("Valor: "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }

    }

    public static void main(String[] args) {

        System.out.println("Ingrese los 10 valores del primer arreglo:");
        carga(arr1);
        System.out.println("Ingrese los 10 valores del segundo arreglo:");
        carga(arr2);

        int[] arr3 = new int[10];
        for(int i = 0; i< arr1.length; i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        System.out.printf("\n Primer arreglo: %s", Arrays.toString(arr1));
        System.out.printf("\n Segundo arreglo: %s", Arrays.toString(arr2));
        System.out.printf("\n Arreglo de Sumatoria resultante : %s", Arrays.toString(arr3));

    }












}

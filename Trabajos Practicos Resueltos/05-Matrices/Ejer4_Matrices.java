/*ARREGLAR PROBLEMA AL MOSTRAR LA LISTA DE MENORES Y MAYORES.*/

import java.util.Arrays;
import java.util.Scanner;

/*Escriba un programa que dada una lista de números enteros y una constante positiva K ,
escribir una función que:
a) Devuelva tres listas, una con los menores, otra con los mayores y otra con los iguales a
K .
b) Devuelva una lista con aquellos que son múltiplos de K .*/
public class Ejer4_Matrices {

    static Scanner entrada = new Scanner(System.in);


    public static String menoresK(int[] arr, int valor){

        int[] aux1 = arr; //menores
        int x1 = 0, cantMen = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < valor) {
                aux1[x1] = arr[i];
                x1++;
                cantMen++;
            }
        }

        int[] menores =  new int[cantMen];

        if(cantMen > 0){

            for(int i = 0; i < menores.length; i++){
                menores[i] = aux1[i];
            }

            return Arrays.toString(menores);

        }else{
            return "No hay menores que K.";
        }

    }

    public static void  clasificacion( int[] arr, int valor){

        int[] auxA = new int[arr.length]; //menores
        int[] auxB = new int[arr.length]; //mayores
        int[] auxC = new int[arr.length]; //iguales
        int x = 0, y = 0, z = 0;
        int cantMen = 0, cantMay = 0, cantIgu = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < valor){
                auxA[x] = arr[i];
                x++;
                cantMen++;

            } else if (arr[i] > valor) {
                auxB[y] = arr[i];
                y++;
                cantMay++;
            }else{
                auxC[z] = arr[i];
                z++;
                cantIgu++;
            }
        }

        System.out.println(Arrays.toString(auxA));
        System.out.println(Arrays.toString(auxB));
        System.out.println(Arrays.toString(auxC));

        if(cantMen > 0){

            int[] menores =  new int[cantMen];

            for(int i = 0; i < menores.length; i++){
                menores[i] = auxA[i];
            }

            System.out.println("Lista de Menores que K: "+Arrays.toString(menores));

        }else{
            System.out.println("No hay menores que K.");
        }

        if(cantMay > 0){

            int[] mayores = new int[cantMay];

            for(int i = 0; i < mayores.length; i++){
                mayores[i] = auxB[i];
            }

            System.out.println("Lista de Mayores que K: "+Arrays.toString(mayores));

        }else{
            System.out.println("No hay mayores que K.");
        }


        if(cantIgu > 0){

            int[] iguales = new int[cantIgu];

            for( int i = 0; i < iguales.length; i++){
                iguales[i] = auxC[i];
            }
            System.out.println("Lista de iguales que K: "+ Arrays.toString(iguales));

        }else{
            System.out.println("No hay iguales que k.");
        }


    }


    public static int[] multiplosK(int[] arr, int k){
        int[] aux = arr;
        int contador = 0, j = 0;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] % k == 0){
                aux[j] = arr[i];
                j++;
                contador++; // para obtener el tamanio del arreglo final.
            }
        }

        //obtenemos un arreglo sin elementos ceros al final y con el tamaño acorde a los elementos mutiplos de k.
        int[] multiplos = new int[contador];
        for(int i = 0; i < multiplos.length; i++){
            multiplos[i] = aux[i];
        }

        return multiplos;
    }


    public static void main(String[] args) {

        int tamanio, k;

        //elección de tamaño de la lista
        System.out.println("Ingrese tamaño de la lista:");
        tamanio = entrada.nextInt();
        int[] listaNumeros = new int[tamanio];

        System.out.println("Ingrese los valores de la lista:");

        //carga de la lista
        for( int i = 0; i < listaNumeros.length; i++){
            System.out.println("elemento numero "+(i+1)+" :");
            listaNumeros[i] = entrada.nextInt();
        }

        System.out.println("Ingrese el valor de la constante positiva K:");
        k = entrada.nextInt();


        System.out.println("Lista de los numeros multiplos de K: "+Arrays.toString(multiplosK(listaNumeros,k)));

        clasificacion(listaNumeros,k);








    }

}

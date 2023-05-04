/*Escriba un programa para realizar otra función que invierta una lista, similar al ejercicio anterior,
pero en lugar de devolver una nueva, modifique la lista dada para invertirla, sin usar listas
auxiliares.*/


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejer4_Arreglos {



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanio;

        System.out.println("Ingrese el tamaño del arreglo de palabras:");
        tamanio = entrada.nextInt();

        String[] nombres = new String[tamanio];

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombre "+(i+1)+": ");
            nombres[i] = entrada.next();
        }


        //1era Forma:
        //la clase Collections proporciona el método reverse que invierte una lista (List)
        // para ello primero convertimos el arreglo en una lista con Arrays.asList.
        Collections.reverse(Arrays.asList(nombres));

        System.out.println(Arrays.toString(nombres));

        //2da Forma:
        for(int i = 0, j = nombres.length-1; i < j; i++, j--){
            String temp = nombres[i]; //resguardo el primer elemento.
            nombres[i] = nombres[j]; //le asigno al primer elemento lo que tiene el ultimo
            nombres[j] = temp; // le asigno  al ultimo elemento lo que tiene el primero
        }

        System.out.println(Arrays.toString(nombres));


    }
}

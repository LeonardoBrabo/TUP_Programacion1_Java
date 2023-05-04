/*Escriba un programa para realizar una función que, dada una lista, devuelva una nueva lista
cuyo contenido sea igual a la original pero invertida.
Así, dada la lista [“Di”, “buen”, “día”, “a”, “papa”] ,
deberá devolver [“papa”, “a”, “día”, “buen”, “Di”] .*/

import java.util.Arrays;

public class Ejer3_Arreglos {

    public static String[] invertida (String[] arr){
        String[] inver = new String[arr.length];
        int j = 0 ;
        for( int i = arr.length-1 ; i >= 0; i--){
            inver[j] = arr[i];
            j++;
        }

        return  inver;
    }

    //otra forma de invertir el arreglo
    /*for (int i = invertido.length - 1, j = 0; i >= 0; i--, j++) {
            invertido[i] = array[j];
        }*/

    /*otras formas de invertirlo: https://parzibyte.me/blog/2019/07/18/invertir-arreglo-java/*/

    public static void main(String[] args) {
        String[] palabras = {"Di","buen","día","a","papá"};

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(invertida(palabras)));


    }
}

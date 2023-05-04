/*Escriba un programa que solicite al usuario un valor entero para establecer el tamaño de un
arreglo de números enteros. Luego utilice ese valor para crear el arreglo y posteriormente
solicitar al usuario que ingrese cada uno de los valores para completar el arreglo.
Finalmente, imprima por pantalla la lista de valores ingresados por el usuario en:
a) El mismo orden en que fueron leídos por el teclado.
b) En orden inverso al que fueron cargados.
c) Una lista de todos los números pares.
d) Un lista de todos los valores que se encuentran ubicados en posiciones impares en el
arreglo.*/
import java.util.Scanner;

public class Ejer1_Arreglos {

    //recorre el arreglo para mostrar sus elementos.
    public static void recorrerArreglos(int[] arreglo){

        System.out.println(" ");
        for( int elementos : arreglo){
            System.out.printf(elementos+" ");
        }
        System.out.println(" ");

    }

    //produce un arreglo con los elementos en orden inverso al cargado
    public static int[] arregloInverso(int[] arr, int tamanio){
        int[] arregloInverso = new int[tamanio];
        System.out.println(" ");
        int j = 0;
        for(int i = arr.length-1; i>= 0 ; i--){
            arregloInverso[j] = arr[i];
            j++;
        }

        return arregloInverso;
    }

    //obtiene un arreglo con numeros pares.
    //Para mejorar: muestra los ceros que corresponda a los valores impares que no existen en el nuevo arreglo.
    public  static int[] numeroPares(int[] arr, int tamanio){
        int[] auxArr = new int[tamanio];

        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                auxArr[j] = arr[i];
                j++;
            }
        }

        return auxArr;
    }

    //devuelve un string con los valores que están en posiciones impares,(esto es adrede para probar retornar un String)
    //de igual manera de podria utilizar este modulo de codigo para obtener la lista de numeros pares y evitar los ceros del final.
    public static String posicionesImpar(int[] arr, int tamanio){
        String enPosicionesImpares = "";
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                enPosicionesImpares += arr[i]+" ";
            }
        }

        return enPosicionesImpares;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanioArreglo;

        //ingreso del tamanio del arreglo.
        System.out.println("Ingrese el tamaño que contendra el arreglo:");
        tamanioArreglo = entrada.nextInt();

        //le asigno el tamaño que definio el usuario
        int[] numeroEnteros = new int[tamanioArreglo];

        //carga de los elementos del arreglo
        for(int i = 0; i < numeroEnteros.length; i++){
            System.out.println((i+1)+" Ingrese valor:");
            numeroEnteros[i] = entrada.nextInt();
        }


        //mostrar valores cargados en el orden leido por teclado.
        System.out.println("Valores cargados:");
        recorrerArreglos(numeroEnteros);

        //mostrar valores cargados en el orden inverso
        System.out.println("En Orden inverso:");
        recorrerArreglos(arregloInverso(numeroEnteros,tamanioArreglo));


        //mostrar valores de la lista de numeros pares que hay en el arreglo.
        System.out.println("Lista de numeros pares:");
        recorrerArreglos(numeroPares(numeroEnteros,tamanioArreglo));


        System.out.println("Lista de numeros en posiciones impares:");
        System.out.println(posicionesImpar(numeroEnteros,tamanioArreglo));

    }

}

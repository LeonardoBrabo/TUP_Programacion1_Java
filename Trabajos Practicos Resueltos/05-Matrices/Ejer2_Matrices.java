/*Escribir una programa que solicite al usuario el ingreso por teclado de una dimensión N para
crear una matriz cuadrada. Imprima la matriz identidad correspondiente a esa dimensión.*/

import java.util.Scanner;

public class Ejer2_Matrices {

    public static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args){
        int dimension;
        System.out.println("Ingrese una dimensión:");
        dimension = entrada.nextInt();

        int[][] identidad = new int[dimension][dimension];

        //carga de matriz identidad
        for(int i = 0; i < identidad.length; i++){
            for( int j = 0; j < identidad[0].length; j++){
                if(i == j){
                    identidad[i][j] = 1;
                }
            }
        }

        //mostrar matriz identidad
        for(int j = 0; j < identidad[0].length; j++){
            for(int i = 0; i < identidad.length; i++){
                System.out.print(identidad[i][j]+" ");
            }
            System.out.println(" ");
        }




    }
}

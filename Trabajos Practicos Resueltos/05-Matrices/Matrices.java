import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    //carga de la matriz
    public static void Carga(int[][] matriz){
        int filas, columnas;
        Scanner entrada = new Scanner(System.in);

        for( filas = 0; filas < matriz.length; filas++ ){
            for(columnas = 0; columnas < matriz[0].length; columnas++){

                System.out.printf("\nfila :%d , columna: %d. Ingrese valor:",filas,columnas);
                matriz[filas][columnas] = entrada.nextInt();

            }
        }
    }

    public static void main(String[] args) {


        int[][] ventas = new int[4][3];

        int[] totalesPorSucu = new int[3];

        int f ,c ,t= 0;
        int totalSucursal;

        System.out.println(ventas.length); //cantidad de filas
        System.out.println(ventas[0].length); //cantidad de columnas

        //método de carga:
        Carga(ventas); // al ser paso por referencia el arreglo queda modificado.

        //acumuladores
        for( f = 0; f < ventas.length; f++ ){

            totalSucursal = 0;  //pone en cero al cambiar de sucursal
            for(c = 0; c < ventas[0].length; c++){

                totalSucursal += ventas[f][c];  //acumulamos

            }
            //se guardan o muestran los totales parciales: total por sucursal.
            System.out.println("total sucursal "+f+": $"+totalSucursal);

            if(t < totalesPorSucu.length){

                totalesPorSucu[t] += totalSucursal; //guardo los totales en el arreglo de totales
                t++; // avanzo la posición del arreglo de totales.
            }

        }

        //mostrar matriz.
        for( f = 0; f < ventas.length; f++ ){
            for(c = 0; c < ventas[0].length; c++){

                System.out.print(ventas[f][c]+" | ");
            }
            System.out.println(" ");
        }

        System.out.println("Totales: "+ Arrays.toString(totalesPorSucu));


    }
}


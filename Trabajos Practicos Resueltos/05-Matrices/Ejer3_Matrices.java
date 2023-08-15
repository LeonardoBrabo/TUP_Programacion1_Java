import java.util.Scanner;

/*Escribir un programa que solicite las dimensiones de 2 matrices y luego sus valores
correspondientes para cada posición dentro de la matriz. Posteriormente implementar:
a) Una función que reciba dos matrices y devuelva la suma.
b) Una función que reciba dos matrices y devuelva el producto.*/
public class Ejer3_Matrices {

    public static Scanner entrada = new Scanner(System.in);

    public static int[][] sumaMatrices( int[][] matriz1 , int[][] matriz2){

        int[][] matrizResultante = new int[matriz1.length][matriz1[0].length];

        for(int fila = 0; fila < matriz1.length; fila++){
            for( int columna = 0; columna < matriz1[0].length; columna++){

                matrizResultante[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna];
            }
        }

        return matrizResultante;
    }

    public static int[][] productoMatrices( int[][] matriz1 , int[][] matriz2){

        //Lugar en donde se almacena el resultado
        int[][] matrizResultante = new int[matriz1.length][matriz2[0].length]; //la dimension resultante es filas m1 y columnas m2

        // Necesitamos hacer esto por cada columna de la segunda matriz2
        for (int a = 0; a < matriz2[0].length; a++) {
            // Dentro recorremos las filas de la primera matriz1
            for (int i = 0; i < matriz1.length; i++) {
                int suma = 0;
                // Y cada columna de la primera (A)
                for (int j = 0; j < matriz1[0].length; j++) {
                    // Multiplicamos y sumamos resultado
                    suma += matriz1[i][j] * matriz2[j][a];
                }

                matrizResultante[i][a] = suma;
            }

        }

        return matrizResultante;
    }

    public static void cargarMatriz(int[][] matrix){

        for(int fila = 0; fila < matrix.length; fila++){
            for( int columna = 0; columna < matrix[0].length; columna++){
                System.out.print("valor fila: "+fila+" columna: "+columna+" :");
                matrix[fila][columna] = entrada.nextInt();
            }
        }


    }

    public static int dimensionFilas(){

        int filas;

        System.out.print("cantidad de filas: ");
        filas = entrada.nextInt();

        return filas;
    }

    public static int dimensionColumnas(){
        int columnas;

        System.out.print("cantidad de columnas: ");
        columnas = entrada.nextInt();

        return columnas;
    }

    public static void imprimirMatriz( int[][] matrix){

        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {

         int op, fm1 = 0, cm1 = 0, fm2 = 0, cm2 = 0;


        System.out.println("Elija una operación a realizar con matrices:");
        System.out.println("1-Suma de Matrices");
        System.out.println("2-Producto de Matrices");
        System.out.println("3-Salir");
        op = entrada.nextInt();


        if( op == 1 || op == 2 ){

            System.out.println("Ingrese la dimensión de la primer matriz:");

            fm1 = dimensionFilas();
            cm1 = dimensionColumnas();

            System.out.println("----------------------------------------");

            System.out.println("Ingrese la dimensión de la segunda matriz:");

            fm2 = dimensionFilas();
            cm2 = dimensionColumnas();

        }


        switch (op){

            case 1:
                System.out.println("Eligio Suma de Matrices:");
                System.out.println("Recuerde que ambas matrices tienen que tener la misma dimension para poder sumarlas.");

                if((fm1 == fm2) && (cm1 == cm2)){

                    int[][] matrizUno = new int[fm1][cm1];
                    int[][] matrizDos = new int[fm2][cm2];

                    System.out.println("Carga de Matriz 1:");
                    cargarMatriz(matrizUno);
                    System.out.println("Carga de Matriz 2");
                    cargarMatriz(matrizDos);

                    System.out.println("Matriz 1:");
                    imprimirMatriz(matrizUno);
                    System.out.println("Matriz 2:");
                    imprimirMatriz(matrizDos);
                    System.out.println("Matriz resultante del producto: ");
                    imprimirMatriz(sumaMatrices(matrizUno, matrizDos));
                }else{
                    System.out.println("No se puede realizar la suma.");
                    System.out.println("Las matrices no son equidimensionales");
                }
                break;
            case 2:
                System.out.println("Eligio Producto de Matrices:");
                System.out.println("Recuerde que el numero de columnas de la primer matriz tiene que ser igual a numero de filas de la segunda matriz");

                if( cm1 == fm2 ){

                    int[][] matrizUno = new int[fm1][cm1];
                    int[][] matrizDos = new int[fm2][cm2];

                    System.out.println("Carga de Matriz 1:");
                    cargarMatriz(matrizUno);
                    System.out.println("Carga de Matriz 2");
                    cargarMatriz(matrizDos);

                    System.out.println("Matriz 1:");
                    imprimirMatriz(matrizUno);
                    System.out.println("Matriz 2:");
                    imprimirMatriz(matrizDos);
                    System.out.println("Matriz resultante del producto: ");
                    imprimirMatriz(productoMatrices(matrizUno,matrizDos));
                }else{

                    System.out.println("No se puede realizar el producto");
                    System.out.println("el numero de columnas de la primer matriz es distinto al numero de filas de la segunda matriz");
                }
                break;
            case 3:

                System.out.println("Adios!"); break;

            default:

                System.out.println("Opcion no disponible."); break;

        }












    }
}

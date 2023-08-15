import java.util.Scanner;

public class Ejer1_Matrices {

    public static Scanner entrada = new Scanner(System.in);


    public static void cargarMatriz(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){ //recorre las filas
            for(int j = 0; j < matrix[0].length;j++){ //recorre las columnas. pregunta la long de una fila
                System.out.println("ingresar elemento ["+i+"] ["+j+"]");
                matrix[i][j] = entrada.nextInt();
            }
        }
        /*como la carga es por referencia, la matriz ya está cargada al terminar el procedimiento*/
    }


    // mostrar matriz.
    public static void imprimirMatriz(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[1].length; j++){

                System.out.print(matrix[i][j]+" | ");


            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int filas,columnas;
        System.out.print("Ingrese la cantidad de filas: ");
        filas = entrada.nextInt();

        System.out.print("Ingrese la cantidad de columnas:");
        columnas = entrada.nextInt();

        int[][] matrizNumerica = new int[filas][columnas];

        cargarMatriz(matrizNumerica);
        imprimirMatriz(matrizNumerica);

    }
}

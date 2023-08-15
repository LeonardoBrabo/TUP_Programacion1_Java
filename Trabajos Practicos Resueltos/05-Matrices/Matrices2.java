import java.util.Scanner;

public class Matrices2 {

    public static Scanner entrada = new Scanner(System.in);


    // cargar matriz:
    //para recorrer primero cada fila.
    //si queremos recorrer cada columna primero cambiar el orden de recorrido:
    // primero matrix[0].length y luego matrix.length
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

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //inicializar matrices:
        int[][] matriz1 = new int[7][3];

    }
}

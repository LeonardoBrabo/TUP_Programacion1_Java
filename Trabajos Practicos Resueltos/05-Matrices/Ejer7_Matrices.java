import java.util.Locale;
import java.util.Scanner;

public class Ejer7_Matrices {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Ingrese cantidad de filas de la matriz: ");
        int filas = entrada.nextInt();

        System.out.println();
        System.out.print("Ingrese cantidad de columnas de la matriz: ");
        int colum = entrada.nextInt();

        System.out.printf("Cargue la matriz %dx%d:",filas,colum);
        int[][] mat = new int[filas][colum];
        for(int i = 0; i < mat.length;i++){
            for( int j = 0; j < mat[0].length; j++){
                System.out.printf("\nIngrese valor posicion [%d][%d]: ",filas,colum);
                mat[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz Resultante:");
        for(int i = 0; i < mat.length;i++){
            for( int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Ingrese un valor a buscar en la matriz: ");
        int buscar = entrada.nextInt();
        boolean encontrado = false;
        for(int i = 0; i < mat.length;i++){
            for( int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == buscar){
                    System.out.println("El valor "+buscar+" existe en la fila "+i+" columna "+j);
                    encontrado = true;
                }
            }
        }

        if(!encontrado)
            System.out.println("El valor NO EXISTE en la matriz.");

    }
}

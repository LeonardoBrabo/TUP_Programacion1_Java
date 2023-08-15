import java.util.Scanner;

public class Ejer5_Matrices {

    static Scanner entrada = new Scanner(System.in);

    public static void carga(int[][] matrix){
        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){
                System.out.print("Ingrese valor posicion ["+i+"]"+"["+j+"]: ");
                matrix[i][j] = entrada.nextInt();
            }
        }
    }

    public static void mostrar(int[][] matrix){
        System.out.println();
        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){

                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

    }

    public static int[][] ceroDiagonales(int[][] matrix){

        int[][] cerDiag = new int[matrix.length][matrix[0].length];
        /*clono el contenido en un nuevo arreglo para no modificar la matriz original*/
        for(int i = 0; i < matrix.length; i++){
            cerDiag[i] = matrix[i].clone();
        }

        //int [][] cerDiag = matrix.clone(); /*esto es solo posible cuando es un vector unidimensional*/

        /*recorre la diagonal principal y la pone a cero*/
        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){

                if(i == j) cerDiag[i][j] = 0;

            }

        }

        /*recorre la diagonal secundaria y la pone a cero*/
        int j = matrix.length-1;
        for(int i =  0; i < cerDiag.length; i++){
            cerDiag[i][j] = 0;
            j--;
        }

        return cerDiag;
    }

    public static int[][] ceroUltimaYprimeraFila(int[][]matrix){

        int[][] ultyPrim = new int[matrix.length][matrix[0].length];
        /*clono el contendio en un nuevo arreglo para no modificar la matriz original*/
        for(int i = 0; i < matrix.length; i++){
            ultyPrim[i] = matrix[i].clone();
        }

        for(int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length;j++){
                ultyPrim[0][j] = 0;
                ultyPrim[matrix.length-1][j] = 0;
            }
        }

        return ultyPrim;
    }

    public static int[][] sumaDeIndices(int[][] matrix){
        int[][] matSum = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            matSum[i] = matrix[i].clone();
        }
        for(int i = 0; i < matSum.length; i++){
            for( int j = 0; j < matSum[0].length; j++){
                matSum[i][j] = i+j;
            }
        }

        return matSum;

    }

    public static int[][] llenadoDiagonal(int[][] matrix){
        int[][] resultante = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            resultante[i] = matrix[i].clone();
        }

        int numero = 1;
        for( int i = 0; i < resultante.length; i++){
            for( int j = 0; j < resultante[0].length;j++){
                if(i == j){
                    resultante[i][j] = numero;
                    numero++;
                }
            }
        }
        return resultante;
    }

    public static int[][] filasParesImpares(int[][] matrix){
        int[][] resultante = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            resultante[i] = matrix[i].clone();
        }


        for( int i = 0; i < resultante.length; i++){

            int numero = 1;
            int numero2 = resultante.length;
            for( int j = 0; j < resultante[0].length;j++){
                if(i%2 == 0){
                    resultante[i][j] = numero;
                    numero++;
                }else{
                    resultante[i][j] = numero2;
                    numero2--;
                }
            }
        }
        return resultante;
    }
    public static void main(String[] args) {

        System.out.print("Ingrese un valor de dimension para la matrix: ");
        int dim = entrada.nextInt();

        int[][] mat = new int[dim][dim];
        carga(mat);
        System.out.println("Matriz cargada:");
        mostrar(mat);

        System.out.println("Matriz con la diagonal principal y secundaria rellena de ceros:");
        mostrar(ceroDiagonales(mat));

        System.out.println("Matriz con la primera y ultima fila rellena de ceros");
        mostrar(ceroUltimaYprimeraFila(mat));

        System.out.println("La matriz principal se mantiene intacta:");
        mostrar(mat);

        System.out.println("Matriz cada posicion es la suma del indice de la fila con la de la columna:");
        mostrar(sumaDeIndices(mat));

        System.out.println("Funcion que llena la diagonal principal con los numero 1 a N:");
        mostrar(llenadoDiagonal(mat));

        System.out.println("Función que llene las filas pares con 1 a n y las impares con n a n-1");
        mostrar(filasParesImpares(mat));

    }

}

import java.util.Arrays;

public class Ejer6_Matrices {
    public static void main(String[] args) {
        double[][] mat = {
                {3.5,6.5,30,8.2,0},
                {4,0,-1,3.6,1.4},
                {10,-1.5,3.4,6.6,2}
        };

        double[] valores= new double[mat.length];
        double suma;
        for(int i = 0; i < mat.length; i++){
            suma = 0;
            for( int j = 0; j < mat[0].length;j++){
                suma += mat[i][j];
            }
             valores[i] = suma;
        }

        System.out.println("Arreglo Resultante: "+Arrays.toString(valores));

    }
}

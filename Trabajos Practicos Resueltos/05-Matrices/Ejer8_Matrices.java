import java.util.Arrays;
import java.util.Scanner;

public class Ejer8_Matrices {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double [][] calificaciones = new double[6][4];

        double [] promedios = new double[4];

        for(int i = 0; i < 5; i++){ //no pasamos por la fila de los promedios
            System.out.println("Cliente numero "+(i+1)+":");
            for( int j = 0; j < 4; j++){
                switch (j){
                    case 0:
                        System.out.println("Antencion de parte de los empleados: ");
                        calificaciones[i][0] = entrada.nextDouble();
                        calificaciones[5][0] += calificaciones[i][0];
                        break;
                    case 1:
                        System.out.println("Calidad de la comida: ");
                        calificaciones[i][1] = entrada.nextDouble();
                        calificaciones[5][1] += calificaciones[i][1];
                        break;
                    case 2:
                        System.out.println("Justicia del precio:");
                        calificaciones[i][2] = entrada.nextDouble();
                        calificaciones[5][2] += calificaciones[i][2];
                        break;
                    case 3:
                        System.out.println("Ambiente:");
                        calificaciones[i][3] = entrada.nextDouble();
                        calificaciones[5][3] += calificaciones[i][3];
                        break;
                    default: break;
                }
            }
        }

        for( int j = 0; j < calificaciones[0].length;j++){
            calificaciones[5][j] /= (double) 5;
        }

        /*mostrar matriz*/
        for( int i = 0; i < calificaciones.length; i++){
            for( int j = 0; j < calificaciones[0].length;j++){
                System.out.print(calificaciones[i][j]+" ");
            }

            System.out.println();
        }

        for( int i = 0; i < promedios.length; i++){
             promedios[i] = calificaciones[5][i];
        }
        System.out.println("Arreglo de promedios es igual a: "+ Arrays.toString(promedios));

        Arrays.sort(promedios);
        System.out.println("Arreglo ordenado : "+ Arrays.toString(promedios));

    }
}

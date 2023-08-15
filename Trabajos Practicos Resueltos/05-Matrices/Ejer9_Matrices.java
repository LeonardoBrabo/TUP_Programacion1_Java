import java.util.Scanner;

public class Ejer9_Matrices {


    public static void dias(int numerodia){

        switch (numerodia){
            case 0:
                System.out.println("Dia Lunes:");
                break;
            case 1:
                System.out.println("Dia Martes:");
                break;
            case 2:
                System.out.println("Dia Miercoles");
                break;
            case 3:
                System.out.println("Dia Jueves");
                break;
            case 4:
                System.out.println("Dia Viernes");
                break;
            case 5:
                System.out.println("Dia Sabado:");
                break;
            case 6:
                System.out.println("Dia Domingo:");
                break;
            default: break;
        }

    }

    public static void imprimir(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de vacas:");
        int n = entrada.nextInt();
        int[][] hacienda = new int[7][n+2]; //le agrego dos columnas mas una para la producccion total y otra para el mayor

        for( int diaSemana = 0;  diaSemana < hacienda.length; diaSemana++){
            dias(diaSemana);
            int mayor = -1;
            for( int numVaca = 0; numVaca < hacienda[0].length-2; numVaca++){
                System.out.print("Cantidad de leche vaca numero "+(numVaca+1)+":");
                hacienda[diaSemana][numVaca] = entrada.nextInt();
                hacienda[diaSemana][hacienda[0].length-2] += hacienda[diaSemana][numVaca]; //mando a la columna de prod total de dia.
                //buscamos el de mayor produccion por dia y lo mandamos a la columna de mayor.
                if(hacienda[diaSemana][numVaca] > mayor){
                    mayor = hacienda[diaSemana][numVaca];
                    hacienda[diaSemana][hacienda[0].length-1] = numVaca;
                }
                System.out.println();
            }
        }

        imprimir(hacienda);

        for(int diaSemana = 0;  diaSemana < hacienda.length; diaSemana++){

            dias(diaSemana);
            System.out.println("Produccion total: "+hacienda[diaSemana][hacienda[0].length-2] );
            System.out.println("Mayor produccion del dia hecho por la vaca numero : "+(hacienda[diaSemana][hacienda[0].length-1]+1));



        }


    }
}

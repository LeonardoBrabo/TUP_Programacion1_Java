import java.sql.SQLOutput;
import java.util.Scanner;

public class Sucursales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] sucu = new double[6+1][5+1];
        int numsuc, numdia;
        char continuar;
        do{
            System.out.println("Ingrese dia que quiere cargar:");
            numdia = entrada.nextInt();
            System.out.println("Ingrese numero sucursal:");
            numsuc = entrada.nextInt();

            System.out.printf("\nIngrese valor para suc %d para el dia %d:",numsuc,numdia);
            sucu[numdia][numsuc] = entrada.nextDouble();

            sucu[6][numsuc] += sucu[numdia][numsuc];
            sucu[numdia][5] += sucu[numdia][numsuc];
            sucu[6][5] += sucu[numdia][numsuc];

            System.out.println("Desea continuar? s/n");
            continuar = entrada.next().charAt(0);


        }while(continuar != 'n');

        System.out.println();
        System.out.println("TOTALES POR SUCURSAL:");
        for(int j = 0; j  < sucu[0].length-1; j++ ){
            System.out.println("para la sucursal "+j+":");
            System.out.println("total de ventas en los seis dias: "+sucu[6][j]);

        }
        System.out.println();
        System.out.println("TOTALES PARA CADA DIA:");
        for(int diasSemana = 0; diasSemana < sucu.length-1; diasSemana++){

            System.out.println("para el dia "+diasSemana);
            System.out.println("total por dia semana "+sucu[diasSemana][5]);

        }
        System.out.println("total acumulado de ventas de todas las sucursales por todos dias de la semana: "+sucu[6][5]);
    }
}

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*Escriba un programa para calcular el promedio de 20 valores almacenados en un arreglo. Los
valores deben ser ingresados por teclado. Además, determinar cuántos valores son mayores
que el promedio. Imprima:
a) El promedio
b) La cantidad de valores mayores al promedio y la lista de valores.*/
public class Ejer5_Arreglos {


    //funcion que calcula el promedio de los valores del arreglo
    public static double Promedio(double[] arr){
        double prom, suma = 0;
        int cont = 0;

        for(double elemento : arr){
            suma += elemento;
            cont++;
        }

        prom = suma / cont;

        return prom;
    }


    //funcion que cuenta la cantidad de valores que son mayores al promedio calculado
    public static int contMayores(double[] arr, double prom){
        int contmayores = 0;
        for(double i : arr){
            if(i > prom){
                contmayores++;
            }
        }
        return contmayores;
    }


    //funcion que muestra un String con los valores que son mayores que el promedio calculado.
    public static String mayoresProm(double[] arr,double prom, int contador){


        double[] mayoresP = new double[contador];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if( arr[i] > prom){
                mayoresP[j] = arr[i];
                j++;
            }
        }

        return Arrays.toString(mayoresP);
    }


    //funcion principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] valores= new double[20];

        System.out.println("Ingrese los valores:");
        for(int i = 0 ; i < valores.length;i++){
            System.out.println("valor N° "+(i+1)+": ");
            valores[i] = entrada.nextDouble();
        }

        double prom = Promedio(valores);
        int contador = contMayores(valores,prom);

        System.out.println("El promedio total es: "+prom);
        System.out.println("La cantidad total de valores mayores al promedio: "+contador);
        System.out.println("Los valores mayores del promedios son:");
        System.out.println(mayoresProm(valores,prom,contador));




    }
}

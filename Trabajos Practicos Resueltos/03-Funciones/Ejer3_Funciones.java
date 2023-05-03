import java.util.Locale;
import java.util.Scanner;

public class Ejer3_Funciones {

    //Función que devuelve un String con los valores de las operaciones básicas de dos números.
    public static String Operaciones(double num1, double num2){

        double suma, resta, producto , division;
        suma =  num1+ num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;
        if(num2 == 0){
            return "Suma: "+suma+", Resta: "+resta+", Producto: "+producto+", Division no se puede realizar por cero";
        }

        return "Suma: "+suma+", Resta: "+resta+", Producto: "+producto+", Division: "+division;
    }

    //función que calcula la tabla de un numero y devuelve un arreglo.
    public static int[] Tabla(int numero){

        int[] tab = new int[11];

        for(int i = 1; i<tab.length;i++){
            tab[i] = i*numero;
        }

        return tab;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //para ingresar el punto decimal.

        System.out.printf("\nIngrese el primer numero: ");
        double n1 = entrada.nextDouble();

        System.out.printf("\nIngrese el segundo numero:");
        double n2 = entrada.nextDouble();

        System.out.println(Operaciones(n1,n2)); //muestra las operaciones

        System.out.println("Ingrese un numero para ver su tabla:");
        int numerotabla = entrada.nextInt();

        int[] mostrarTabla = Tabla(numerotabla); //creamos una un arreglo con el arreglo obtenido de la funcion.

        //recorremos el nuevo arreglo.
        System.out.printf("\nTabla del %d:",numerotabla);
        for(int i = 1; i <mostrarTabla.length; i++){
            System.out.printf("\n%d * %d = %d",numerotabla,i,mostrarTabla[i]);
        }
    }



}





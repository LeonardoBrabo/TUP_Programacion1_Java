import java.util.Scanner;

public class Ejer9_Funciones {

    public static double convertir_Fahrenheit(double C){
        return (9d/5)*C+32;
    }
    //con (double)9 se castea al 9 como un valor decimal, java toma al ser un entero division entera sino hacemos esto.
    //otra forma de castear los numero seria agreando al final la d de double o la f si es float en almenos un numero.
    //tambien se podria multiplicar uno de los numero enteros por 1.0 para que de el mismo resultado.

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los grados Celcius a convertir en Fahrenheit:");
        double celcius = entrada.nextDouble();
        System.out.println("los C° "+celcius+" es en F°:"+convertir_Fahrenheit(celcius));
    }
}

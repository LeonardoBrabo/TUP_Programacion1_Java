import java.util.Scanner;

public class Ejer6_Funciones {

    public static double areaTriangulo (double base, double altura){

        return (base*altura)/2;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese base del triangulo:");
        double b = entrada.nextDouble();
        System.out.println("Ingrese altura del triangulo:");
        double a = entrada.nextDouble();

        System.out.println("El area del triangulo es: "+areaTriangulo(b,a));
    }

}

import java.util.Scanner;

public class Ejer1_Funciones {

    public static String Saludo (String nombre){

        return  "Hola "+nombre;
    }

    //función que devuelve un producto.
    public static int Producto (int numero1, int numero2){

        return numero1 * numero2;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nom = entrada.nextLine();

        System.out.println(Saludo(nom));

        System.out.println("Producto de números:");
        System.out.println("Ingrese los dos números:");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        int resultado = Producto(n1,n2);
        System.out.println("el producto es: "+resultado);

    }
}

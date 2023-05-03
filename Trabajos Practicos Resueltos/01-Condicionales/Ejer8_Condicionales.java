import java.util.Scanner;

/*Leer 2 números; si son iguales que los multiplique, si el primero es mayor que el segundo que los reste y si no que los sume.*/
public class Ejer8_Condicionales {
    public static void main(String[] args) {

        int n1,n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero 1:");
        n1 = entrada.nextInt();

        System.out.println("Numero 2:");
        n2 = entrada.nextInt();

        if(n1 == n2) System.out.println("El producto de los numeros es: "+(n1*n2));
        else if( n1 > n2) System.out.println("La resta de los numeros es: "+(n1-n2));
        else System.out.println("La suma de los numeros es :"+(n1+n2));
    }
}

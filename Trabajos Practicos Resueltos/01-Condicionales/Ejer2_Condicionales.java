import java.util.Scanner;

/*
* En un almacén se hace un 20% de descuento a los clientes
 * cuya compra supere los $1000.
 * Mostrar por pantalla cuál será la cantidad
  * que pagará una persona por su compra.
* */
public class Ejer2_Condicionales {
    public static void main(String[] args) {

        double compra;
        final double desc = 0.20;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de Compra: ");
        compra = entrada.nextDouble();

        if(compra > 1000){
            System.out.println("Tiene un descuento del 20%: $ "+compra*desc);
            compra = compra-compra*desc; //usando la misma variable
            // compra = compra*0.80; otra forma

        }

        System.out.printf("\nTotal a pagar: %.2f",compra);

    }
}

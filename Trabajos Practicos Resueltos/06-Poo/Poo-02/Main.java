import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Cuenta cuenta1 = new Cuenta("Pedro Garcia");

        Cuenta cuenta2 = new Cuenta("Maria Gonzales",500000);

        double saldoActual = cuenta1.retirar(10000);

        System.out.println("Saldo actual de la cuenta de : "+cuenta1.getTitular()+"Saldo :"+saldoActual);

        cuenta2.retirar(90000);
        System.out.println("Monto cuenta "+cuenta2.getTitular()+" es : "+cuenta2.getCantidad());

        System.out.println(cuenta1.imprimirEstado());

        System.out.println(cuenta1.toString());

        boolean masSaldo = cuenta1.tieneMasSaldo(cuenta2); //Compara con un método si el metodo izq tiene mas saldo que el pasado por parametro.
        System.out.println(masSaldo);*/


        //-------Ejer 2  Libros--------

       /* Libro libro1 = new Libro("9788411190039","Habitos Atómicos","James Clear",325);

        Libro libro2 = new Libro("9788439596226","El señor de los Anillos","Tolkien",456);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un ISBN:");
        String isb = entrada.nextLine();

        Libro libro3 = new Libro(isb);
        System.out.println(libro3.toString());

        System.out.println(libro1.toString());

        System.out.println(libro2.toString());

        if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas()){
            System.out.println("El libro: "+libro1.getTitulo()+" tiene mayor cantidad de páginas");
        }else{
            System.out.println("El libro: "+libro2.getTitulo()+" tiene mayor cantidad de páginas");
        }*/

        //Ejer 3- Fraccion-----
        Fraccion fraccion1 = new Fraccion(3,5);

        Fraccion fraccion2 = new Fraccion(7,8);

        Fraccion resultante =  fraccion1.sumarFracciones(fraccion2);
        System.out.println(resultante.toString());

        System.out.println((fraccion1.multiplicarFracciones(fraccion2)).toString());
    }
}
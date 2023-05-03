import java.util.Scanner;

public class Ejer4_Repetitivas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  valor= 0;
        int total = 0, cont= 0;

        while(valor >= 0 && valor <= 100){

            total+=valor; //se evita que al ingresar un valor > 100 se acumule.
            System.out.println("Ingrese un valor:");
            valor = entrada.nextInt();
            if(valor <=100) cont++; //para que no sume 1 cuando es un numero fuera de rango

        }
        System.out.println("Suma: "+total);
        System.out.println("Promedio total: "+total/cont);
        System.out.println(cont);
    }
}

// 12 ,45,96,101
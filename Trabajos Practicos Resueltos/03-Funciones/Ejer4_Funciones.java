import java.util.Scanner;

public class Ejer4_Funciones {

    public static String duracionTotal(int h1, int h2, int m1, int m2, int s1, int s2){
        int sumaHoras, sumaMinutos, sumaSegundos;
        sumaHoras = h1 + h2;
        sumaMinutos = m1 + m2;
        sumaSegundos = s1 + s2;
        if(sumaSegundos >= 60){
            sumaMinutos++;
            sumaSegundos -= 60;
        }
        if(sumaMinutos >= 60) {
            sumaHoras++;
            sumaMinutos -= 60;
        }

        return "Total: "+sumaHoras+" Horas, "+sumaMinutos+" Minutos, "+sumaSegundos+" Segundos.";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese hora minutos y segundo del primer intervalo:");
        int horas = entrada.nextInt();
        int minutos = entrada.nextInt();
        int segundos = entrada.nextInt();

        System.out.println("Ingrese hora minutos y segundos del segundo intervalo:");
        int horas2 = entrada.nextInt();
        int minutos2 = entrada.nextInt();
        int segundos2 = entrada.nextInt();

        System.out.println(duracionTotal(horas,horas2,minutos,minutos2,segundos,segundos2));


    }

}

import java.util.Scanner;

public class Ejer5_Funciones {

    public static String sumaPuntos (int p1, int p2, int p3, int p4){
        int primerPar, segundoPar;
        primerPar = p1 + p3;
        segundoPar = p2 + p4;

        return "("+primerPar+" , "+segundoPar+")";
    }

    public static String restaPuntos (int p1, int p2, int p3, int p4){
        int primerPar, segundoPar;
        primerPar = p1 - p3;
        segundoPar = p2 - p4;

        return "("+primerPar+" , "+segundoPar+")";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese los dos puntos del primer par de valores:");
        int x1 = entrada.nextInt();
        int y1 = entrada.nextInt();

        System.out.println("Ingrese los dos puntos del segundo par de valores:");
        int x2 = entrada.nextInt();
        int y2 = entrada.nextInt();

        System.out.printf("\nPrimer par: (%d , %d)",x1,y1);
        System.out.printf("\nSegundo par: (%d , %d)",x2,y2);
        System.out.printf("\nSuma: %s",sumaPuntos(x1,y1,x2,y2));
        System.out.printf("\nResta %s",restaPuntos(x1,y1,x2,y2));
    }
}

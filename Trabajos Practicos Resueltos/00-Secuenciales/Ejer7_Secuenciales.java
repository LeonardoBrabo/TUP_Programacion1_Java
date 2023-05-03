import java.util.Scanner;

/*Un profesor desea saber qué porcentaje de hombres y
 qué porcentaje de mujeres hay en un grupo de estudiantes.*/
public class Ejer7_Secuenciales {
    public static void main(String[] args) {

        int total,mujeres,hombres, porhom, pormuj;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hombres: ");
        hombres = entrada.nextInt();
        System.out.println("Ingrese la cantidad de mujeres:");
        mujeres = entrada.nextInt();

        total = hombres + mujeres;
        porhom = (hombres*100) / total;
        pormuj = (mujeres*100) / total;
        System.out.printf("el total es: %d.\nPorcentaje Hombres: %d porciento \nPorcentajes Mujeres: %d porciento",total,porhom,pormuj);


    }
}

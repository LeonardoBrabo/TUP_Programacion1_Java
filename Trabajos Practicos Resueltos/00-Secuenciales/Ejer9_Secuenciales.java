/*
* Se desea conocer el promedio y porcentaje de hombres y mujeres
 * cursando el Programación I en UTN FRRe,
  * teniendo como dato la cantidad de hombres y mujeres
  * de 3 comisiones.
*
* */

import java.util.Scanner;

public class Ejer9_Secuenciales {
    public static void main(String[] args) {

        int h1,m1,h2,m2,h3,m3,porM,sum,porH,promH,promM;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Comision 1:");
        System.out.println("Can Hombres seguido cant mujeres:");
        h1 = entrada.nextInt();
        m1 = entrada.nextInt();

        System.out.println("Comision 2:");
        System.out.println("Can Hombres seguido cant mujeres:");
        h2 = entrada.nextInt();
        m2 = entrada.nextInt();

        System.out.println("Comision 3:");
        System.out.println("Can Hombres seguido cant mujeres:");
        h3 = entrada.nextInt();
        m3 = entrada.nextInt();

        sum = h1+h2+h3+m1+m2+m3;
        porH = ((h1+h2+h3)*100)/sum;
        porM = ((m1+m2+m3)*100)/sum;

        promH = (h1+h2+h3)/3;
        promM = (m1+m2+m3)/3;

        System.out.println("Porcentaje de hombres: "+porH+"%");
        System.out.println("Porcentaje de mujeres: "+porM+"%");
        System.out.println("Promedio de hombres: "+promH);
        System.out.println("Promedio de mujeres: "+promM);


    }
}

import java.util.Scanner;

/*Un empleado de RRHH quiere calcular el promedio de los sueldos de los empleados.
 La cantidad de empleados no se conoce con exactitud,
  pero se sabe que los sueldos deben pertenecer al rango [20000 a 100000].
   La carga finaliza cuando el usuario ingresa un valor fuera del rango.
    Al finalizar se debe informar el promedio de los sueldos ingresados.*/
public class Sueldos {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double prom, suma = 0, sueldo = 20000; //fuerzo la entrada al bucle
        int  contador = 0;

        while( sueldo >= 20000 && sueldo <= 100000){

            System.out.println("ingrese salario empleado N° "+(contador+1));
            sueldo = entrada.nextDouble();


            if( sueldo >= 20000 && sueldo <= 100000 )
            {
                suma += sueldo;
                contador++;
            } else {
                System.out.println("Debe ingresar un valor entre 20000 y 100000");

            }

        }

        prom = suma / contador; //calculo el promedio de los sueldos ingresados

        System.out.printf("\nEl promedio de los sueldos es: $ %.2f",prom);


    }
}

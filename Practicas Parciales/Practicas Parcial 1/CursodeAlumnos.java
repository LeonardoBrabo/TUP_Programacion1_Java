/*En un curso de 10 alumnos,
las notas de 2 parciales de deben cargar en 2 arreglos de enteros (las notas van de 0 a 100) ,
 donde el indice es el código de alumno y el contenido de cada elemento es la nota.
  Sumar el elemento en la primer posición del arreglo A (1er parcial)
   con el primer elemento del arreglo B (2do parcial),
   si el promedio de las 2 notas es mayor o igual que 60,
   guardar el resultado en el primer elemento de un arreglo C, con el mensaje de "Aprobado",
    caso contrario "Desaprobado".
     Así sucesivamente con todos los elementos del arreglo.
      Finalmente informar cuantos alumnos aprobaron y cuantos desaprobaron el curso.*/
public class CursodeAlumnos {
    public static void main(String[] args) {

        double suma,prom;
        int contAprobados = 0, contDesaprobados = 0;

        int[] arregloA = {45,66,89,70,13,100,100,62,23,65};
        int[] arregloB = {98,33,67,12,89,80,42,12,70,67};
        String[] arregloC = new String[10];


        for(int i = 0, j = 0; i < 10; i++, j++){
            suma = arregloA[i] + arregloB[i];
            prom = (double) suma / 2;
            if(prom >= 60){
                arregloC[j] = "Aprobado";
                contAprobados++;
            }else{
                arregloC[j] = "Desaprobado";
                contDesaprobados++;
            }

        }

        for(int i = 0; i < arregloC.length; i++){
            System.out.printf("\nAlumno %d condicion: %s",i,arregloC[i]);
        }

        System.out.printf("\n----------------------------------------\n");
        System.out.println("Cantidad de Alumnos Aprobados: "+contAprobados);
        System.out.println("Cantidad de Alumnos Desaprobados: "+contDesaprobados);








    }
}

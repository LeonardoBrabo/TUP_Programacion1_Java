import java.util.Arrays;
import java.util.Scanner;

/*numero de preguntas del examen: tamaño de los arreglos
 un arreglo que almacene las respuestas del estudiante en base al numero de preguntas, las respuestas van de A a E;
 un arreglo que almacene primeramente las respuestas correctas segun las respuestas del examen.
 calcular el porcentaje de acierto segun la cantidad de preguntas que hay:
* */
public class Ejer12_Arreglos {

    public static int controlEntrada(char opcion){
        int indice;
        char[] opcionesPosibles = {'A','B','C','D','E'};
        indice = Arrays.binarySearch(opcionesPosibles,opcion); //guarda el indice si existe en el arreglo la opcion.

        return indice; // devuelve un indice si existe sino devuelve -1;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantPreguntas;
        int aciertos = 0; //cuenta la cantidad de aciertos
        double nota;
        int verificacion;

        do{ // controla que solo se ingrese las opciones A,B,C,D,E
            System.out.println("Ingrese la cantidad de preguntas que tiene el examen:");
            cantPreguntas = entrada.nextInt();

            if(cantPreguntas == 0) System.out.println("La cantidad de preguntas no puede ser cero.");

        }while(cantPreguntas == 0);


        char[] correctas = new char[cantPreguntas];
        char [] alumno = new char[cantPreguntas];

        System.out.println("Ingrese las respuestas correctas del examen para cada pregunta:");
        for(int i = 0; i < correctas.length; i++){

            do { // controla que solo se ingrese las opciones A,B,C,D,E
                System.out.println("Respuesta correcta de la pregunta " + (i + 1) + ":");
                correctas[i] = entrada.next().charAt(0);

                verificacion = controlEntrada(correctas[i]);

                if(verificacion < 0) System.out.println("ingrese solo los siguiente valores posibles: A,B,C,D o E");

                System.out.println(verificacion);

            }while(verificacion < 0);
        }

        System.out.println("Ingrese las respuestas ingresadas por el alumno");
        for(int i = 0;  i <alumno.length; i++){
            do {
                System.out.println("Respuesta del alumno de la pregunta " + (i + 1) + ":");
                alumno[i] = entrada.next().charAt(0);

                verificacion = controlEntrada(correctas[i]);

                if(verificacion < 0) System.out.println("ingrese solo los siguiente valores posibles: A,B,C,D o E");

            }while(verificacion < 0);
        }

        for(int i = 0; i < correctas.length; i++){
            if(correctas[i] == alumno[i]) aciertos++;
        }

        nota = (double) (aciertos*100)/cantPreguntas;

        System.out.println("Las respuestas correctas son: "+ Arrays.toString(correctas));
        System.out.println("Las respuestas del alumno son: "+ Arrays.toString(alumno));
        System.out.printf("\nLa nota del alumno es: %.2f %% ",nota);

    }
}




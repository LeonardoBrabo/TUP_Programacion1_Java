import java.text.DecimalFormat;
import java.util.Arrays;


/*Escriba un algoritmo que efectúe la normalización de una colección de números reales (float).
Para llevar a cabo esta normalización, se debe en primer lugar encontrar el número mayor de la
colección; luego se divide cada número por dicho valor máximo, de forma que los valores
resultantes (normalizados) estén comprendidos en el intervalo del 0 al 1.*/
public class Ejer9_Arreglos {

    public static void main(String[] args) {

        float[] numerosReales = {1.4f, 0.8f, 0.34f, 4.0f, 2.3f, 7.23f};
        float mayor;
        float [] normalizacion = new float[numerosReales.length];
        int i = 0;

        mayor = numerosReales[0];
        for(float elemento : numerosReales){
            if (elemento > mayor) mayor = elemento;
        }
        for(float elemento : numerosReales) {
            normalizacion[i] = (elemento / mayor);
            i++;
        }


        System.out.println("El arreglo es: "+ Arrays.toString(numerosReales));
        System.out.println("El arreglo normalizado es: "+Arrays.toString(normalizacion));
    }


}

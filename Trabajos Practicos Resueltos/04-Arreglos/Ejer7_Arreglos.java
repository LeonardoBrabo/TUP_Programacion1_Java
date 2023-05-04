import java.util.Arrays;

/*Diseñe un algoritmo que lea dos arreglos A y B de 20 elementos cada uno y multiplique el
primer elemento de A con el último elemento de B y luego el segundo elemento de A por el
décimo noveno elemento de B y así sucesivamente hasta llegar al veinteavo elemento de A por
el primer elemento de B. Almacenar el resultado de las multiplicaciones en un arreglo C.*/
public class Ejer7_Arreglos {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] b = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        int[] c = new int[20];

        for(int i = 0, j = 19,k = 0; k < c.length; i++, j--,k++ ){
            c[k] = a[i] * b[j];
        }

        System.out.println(Arrays.toString(c));

    }
}

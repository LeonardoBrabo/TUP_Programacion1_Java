/*Escribir un programa que dada una lista de números enteros, escribir una función que:
a) Devuelva una lista con todos los que sean primos.
b) Devuelva la sumatoria de los valores
c) Devuelva el promedio de los valores.*/

public class Ejer2_Arreglos {

    public static void main(String[] args) {
        int[] nroEnteros = {23,45,12,450,167,55,21,1,3,76};

        // método clone para copiar directamente un arreglo:
        int[] copiedArray = nroEnteros.clone();  //de esta forma podemos resguardar el arreglo original y forzar como un paso por valor.


        int[] nroPrimos = buscarPrimos(nroEnteros);

        //mostrar en pantalla los numero primos(recorrer el arreglo)
        System.out.println("Los números primos son: ");
        for(int i = 0; i<nroPrimos.length;i++){
            if( nroPrimos[i] != 0){
                System.out.printf(" "+nroPrimos[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("La sumatoria es: "+sumaArreglo(nroEnteros));
        System.out.println("El promedio es: "+promArreglo(nroEnteros));


    }

    //función que devuelve como salida un arreglo
    //si modificamos el arreglo dentro de la función está cambia porque el paso por referencia de un arreglo es por referencia
   private static int[] buscarPrimos(int[] nroEnteros){
        int[] nroPrimos = new int[nroEnteros.length]; //crea un arreglo del tamaño del arreglo nroEnteros.
        for( int i = 0; i< nroEnteros.length;i++){
            if(esPrimo(nroEnteros[i])){ //pasamos el dato de la posición i del arreglo.
                nroPrimos[i] = nroEnteros[i];
            }
        }
        return nroPrimos;
    }

    //función que devuelve un booleano y controla si el número pasado es primo o no.
    public static boolean esPrimo(int nro) {
        for(int i = 2; i<= nro/2; i++){
            if(nro % i== 0){
                return false; /*NO es primo*/
            }
        }
        return true; /*Es primo*/
    }

    // función de suma de los valores primos
    public static int sumaArreglo(int[] arrNumeros){
        int suma = 0;
        for(int i = 0; i<arrNumeros.length;i++){
            suma += arrNumeros[i];
        }
        return  suma;
    }

    public static double promArreglo(int[] arrNumeros){
        double sum= 0;
        double prom;
        for(int i = 0; i<arrNumeros.length;i++){
            sum += arrNumeros[i];
        }
        prom = sum / arrNumeros.length;
        return prom;
    }
}



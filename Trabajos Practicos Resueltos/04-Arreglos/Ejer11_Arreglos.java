
/*Un arreglo de números se llama partidario si todo número que está en una casilla par (0,2,4,…)
es mayor que cualquiera de los números que están en las casillas impares (1,3,5,…). Escriba
un algoritmo que lea un arreglo de números enteros y luego, diga si es partidario o no. Por
ejemplo, si el arreglo es el siguiente: 100 5 200 1 1000 0 600 50 300 4 El programa debe
escribir: es partidario.*/
public class Ejer11_Arreglos {

    public static void main(String[] args) {

        int[] arreglodeEntrada = {100,5,200,1,1000,0,600,50,300,4};

        int contPares = 0, contImpares = 0; // sirven para tener el tamaño de los arreglos nuevos;

        int j = 0, k = 0; //para manejar los dos arreglos nuevos.

        boolean partidario = true;

        //obtenemos el tamaño de cada arreglo nuevo.
       for(int i = 0; i < arreglodeEntrada.length; i++){

           if( i % 2 == 0){
               contPares++; //cuenta las posiciones pares;
           }else{
               contImpares++; //cuenta las posiciones impares;
           }
       }

        //asigno el tamaño segun la cantidad de pares o impares para evitar la generacion de ceros al final del arreglo:
        int [] pares = new int[contPares];
        int [] impares = new int[contImpares];


        //genero los dos arreglos para comparar luego su contenido
        for(int i = 0; i < arreglodeEntrada.length; i++){

            if(i % 2 == 0){
                pares[j] = arreglodeEntrada[i];
                j++;
            }else{
                impares[k] = arreglodeEntrada[i];
                k++;
            }
        }

        //se controla cada posicion par con todas las de posicion impar, para encontrar si alguno es menor,  y cambiar el estado de la bandera.
        for(int i = 0; i < pares.length; i++){
            for(int x = 0; x < impares.length; x++){
                if(pares[i] < impares[x]){
                    partidario = false; //si uno de los valores en las posiciones pares es menor cambia el estado de partidario a false
                    break;
                }
            }
        }

        if(!partidario){
            System.out.println("El arreglo no es Partidario");
        }else{
            System.out.println("El arreglo es Partidario");
        }

    }







}

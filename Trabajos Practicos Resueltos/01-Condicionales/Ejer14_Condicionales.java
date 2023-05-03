import java.util.Scanner;

public class Ejer14_Condicionales {
    public static void main(String[] args) {
        char d1,d2;
        String num;
        int num1,num2;
        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese un numero de dos cifras: ");
        num = ent.next();

        //comprobamos que sea solo de 2 digitos.(falta comprobar que sean solo numeros).
        if(num.length() == 2){
            //guardamos cada digito en este caso tratados como caracter
            d1 = num.charAt(0);
            d2 = num.charAt(1);

            // convertimos los caracteres en entero
            num1 = Character.getNumericValue(d1);
            num2 = Character.getNumericValue(d2);

            System.out.println("El primer digito es :"+d1);
            System.out.println("El segundo digito es :"+d2);
            System.out.println("La suma de los digitos es: "+(num1+num2));

        }else{
            System.out.println("Ingrese solo un numero de dos digitos");
        }
    }
}

/*Se desea leer un número de dos cifras,
 y que se muestre por pantalla sus dígitos.
  Luego informe si la suma de sus dígitos es múltiplo de 3 o no.*/
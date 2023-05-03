public class Ejer2_Funciones {
    //Variables globales se definen fuera del main y de las funciones.
    //Alcance de las variables (local o global) también llamado scope.
    public static int global = 60; //variable global.

    //para procedimientos declaramos la salida de la función como void.
    public static int calcularSegundos(int horas, int min, int segs){
        int totalSegundos = horas*3600+min*global+segs;
        return totalSegundos ;
    }

    public static String formatoHora (int segundos){

        int minutos = segundos / 60;
        int segs = segundos % 60;
        int aux = minutos;
        int hora = minutos / 60;
        minutos = aux % 60;
        return "Horas: "+hora+" Minutos:"+minutos+" Segundos: "+segs;

    }

    //tipos de pasos de variables a los parámetros:
    //para datos primitivos: paso por valor de argumentos como parámetros.
    //para datos estructurados (objetos) : paso por referencia.

    //función principal main
    public static void main(String[] args) {

        System.out.println(calcularSegundos(1,20,45));
        System.out.println(formatoHora(4845));

    }
}

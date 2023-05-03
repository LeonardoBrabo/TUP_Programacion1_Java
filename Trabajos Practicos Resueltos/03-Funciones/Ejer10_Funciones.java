public class Ejer10_Funciones {

    public static double convertir_celcius(int f){
        return (f-32)*5d/9;
    }

    public static void tablaConversion (){
        for(int i = 0; i<=120; i+=10){
            System.out.printf("\n %d F° ->  %.2f C°",i,convertir_celcius(i));
        }
    }

    public static void main(String[] args){
        tablaConversion();
    }
}

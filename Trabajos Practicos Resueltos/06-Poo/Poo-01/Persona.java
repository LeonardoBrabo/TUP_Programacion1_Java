public class Persona {

    /*Atributos:*/
    String nombre;
    String dni;
    int edad;


    public static final String NOMBRE_POR_DEFECTO = "NO name";

    //constructores
    //determina un estado por defecto para los atributos de una clase
    // si ese valor no se ingresa la clase no sé instancia.
    public Persona(String datoDni){
        dni = datoDni;
        nombre = NOMBRE_POR_DEFECTO;
    }

    //contructor que hace opcional las siguientes entradas.
    public Persona(String datoDni, int unaEdad){
        dni = datoDni;
        edad = unaEdad;
        nombre = NOMBRE_POR_DEFECTO;
    }


    public Persona(String datoDni, int unaEdad, String unNombre){
        dni = datoDni;
        edad = unaEdad;
        nombre = unNombre;
    }

    //métodos
    public String comer(){

        return nombre+" de dni:"+dni+" está comiendo";
    }



}

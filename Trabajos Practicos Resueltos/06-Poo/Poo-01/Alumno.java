public class Alumno {

    //atributos

    //con el acceso privado, impido que fuera de la clase se pueda acceder directamente, como método de seguridad.
    private String NroLegajo;
    private String nombre;
    private String apellido;
    private String domicilio;

    final String NOAPE = "NO APELLIDO";
    final String NODOM = "NO TIENE DOMICILIO";

    //constructores

    //constructor minimamente necesario para crear una instancia de Alumno
    public Alumno(String NroLegajo, String nombre){ //se define el mínimo, los dos campos obligatorios
        this.NroLegajo = NroLegajo; //se usa this para diferenciar el atributo del objeto y el parámetro recibido
        this.nombre = nombre;       //si no quiero usar this le cambio de nombre al parámetro recibido del constructor
        apellido = NOAPE;
        domicilio = NODOM;
    }

    //constructor
    public Alumno(String leg, String nom,String ape){
        NroLegajo = leg;
        nombre = nom;
        apellido = ape;
        domicilio = NODOM;
    }

    public Alumno(String leg, String nom,String ape,String dom){
        NroLegajo = leg;
        nombre = nom;
        apellido = ape;
        domicilio = dom;
    }

    //Métodos
    public String presentacion(){

        return "el Alumno "+this.nombre+" "+apellido+" de numero de legajo: "+NroLegajo+" vive en: "+domicilio;
    }

    //modificadores de  acceso : private , public
    //métodos getter y setter

    // con el método set modificamos un atributo que tenga el acceso en private

    public void setNroLegajo(String NroLegajo){
        //permitirá modificar el campo NroLegajo si lo ingresado es mayor a 5.
        if(NroLegajo.length() >5) this.NroLegajo = NroLegajo;

    }

    //Métodos Getters:
    //permite acceder al los atributos con el método getter, a aquellos que son privados.
    public String getNombre(){
        return nombre;
    }



}

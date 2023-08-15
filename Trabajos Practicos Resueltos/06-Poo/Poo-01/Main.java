public class Main {
    public static void main(String[] args){

        //Instanciando una clase
        Persona persona1 = new Persona("37895642",38); //se tiene que si o si ingresar el valor del constructor.
        persona1.nombre = "Juan";

        //enviando un mensaje
        System.out.println(persona1.comer());
        System.out.println(persona1.dni);
        System.out.println(persona1.edad);


        Persona persona2 = new Persona("54895623");
        System.out.println(persona2.dni);
        System.out.println(persona2.comer());


        Persona persona3 = new Persona("54232156",34,"Pepe");
        System.out.println(persona3.comer());

        Alumno alumno1 = new Alumno("78542123","Marcelo");
        System.out.println(alumno1.presentacion());


        Alumno alumno2 = new Alumno("56232154","Yenny","Perez","Av.Alvear 1560");
        System.out.println(alumno2.presentacion());

        //modificando el numero de legajo cuando el método set, porque se lo define como un atributo privado

        alumno1.setNroLegajo("13074290");
        System.out.println(alumno1.presentacion());

        //modificando directamente el atributo si no está en privado
        //alumno1.NroLegajo = "0000000";

        //accediendo de manera directa al valor del atributo sin no es privada la clase
        //System.out.println(alumno1.nombre);

        //usando el método get para acceder al atributo en modo de acceso privado
        System.out.println(alumno1.getNombre());


    }
}
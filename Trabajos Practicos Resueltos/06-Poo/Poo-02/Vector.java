public class Vector {
    private double x;
    private double y;
    private double z;


    //constructores

    public Vector(double x, double y , double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //métodos

    @Override
    public String toString() {
        return "["+x+","+y+","+z+"]";
    }

    public Vector multiplicar(double nro){
        Vector nuevoVector = new Vector(x*nro,y*nro,z*nro);
        return nuevoVector;
    }

   /* public Vector sumar(Vector v){
        if((v.x == 0 && this.x == 0) && (v.y == 0 && this.y == 0) && (v.z == 0 && this.z == 0)){
            System.out.println("Error los vectores no tienen las misma cantidad de elementos.");
            return v;
        }


    }*/





}

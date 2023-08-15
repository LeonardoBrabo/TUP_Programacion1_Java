public class Cuenta {
    private String titular;
    private  double cantidad;

    public static final double SALDO_DEFECTO = 100000;

    //constructores

    public Cuenta(String titular){
        this.titular = titular;
        cantidad = SALDO_DEFECTO;
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }


    //Métodos:

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double ingresar(double monto){
        if(monto > 0){
            cantidad += monto;
        }
        return cantidad;
    }

    public double retirar(double monto){
        if( monto > cantidad){
            cantidad = 0;
        }else{
            cantidad = cantidad  - monto;
        }
        return cantidad;
    }

    public String imprimirEstado(){
        return "Titular: "+titular+"Saldo: "+cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public boolean tieneMasSaldo(Cuenta c1){
        if(this.cantidad > c1.cantidad){
            return true;
        }else{
            return false;
        }
    }

}





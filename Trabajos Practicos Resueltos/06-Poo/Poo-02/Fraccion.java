public class Fraccion {
    private int dividendo;
    private int divisor;

    //constructores:

    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    //métodos


    @Override
    public String toString() {
        return dividendo+"/"+divisor;
    }

    public Fraccion sumarFracciones(Fraccion f2){

        Fraccion resultante = new Fraccion(0,0);

        if(this.divisor == f2.divisor)
        {
            resultante.dividendo = this.dividendo + f2.dividendo;
            resultante.divisor = this.divisor;
        }else{
            resultante.dividendo = this.dividendo * f2.divisor + this.divisor * f2.dividendo;
            resultante.divisor = this.divisor * f2.divisor;
        }

        return resultante;

    }

    public Fraccion multiplicarFracciones(Fraccion f2){
        Fraccion resultante = new Fraccion(0,0);

        resultante.dividendo = this.dividendo * f2.dividendo;
        resultante.divisor = this.divisor * f2.divisor;

        return resultante;
    }
}

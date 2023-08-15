public class Producto {
    private String nombre;
    private String origen;
    private double valor_unitario;
    private int cant_stock;

    public Producto(String nombre, double valor_unitario) {
        this.nombre = nombre;
        this.valor_unitario = valor_unitario;
    }

    public double totalVentas(int cantidadVendida){
        if(cant_stock >= cantidadVendida){

            return valor_unitario*cantidadVendida;

        }else{
            return cant_stock;
        }

    }
}

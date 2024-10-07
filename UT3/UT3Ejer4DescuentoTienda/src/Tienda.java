public class Tienda {
    double precio;
    double descuento ;

    public Tienda(double precio){
        this.precio = precio;
    }
    public void calcularDescuento(){
        if (precio <= 100){
            System.out.println("No se aplicara ningun descuento : " + precio+ "€");
        }else {
            descuento = precio - (precio * 0.10);
            System.out.println("Se ha aplicado un descuento del 10% : " + descuento+ "€");
        }
    }
}
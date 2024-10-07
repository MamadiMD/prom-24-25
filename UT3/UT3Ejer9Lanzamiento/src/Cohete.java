public class Cohete {
    public static final double PESO_MAXIMO = 750000000;
    public static final double COMBUSTIBLE_MINIMO = 20000000;
    private double combustible;
    private double peso;

    public Cohete(double combustible,double peso){
        this.combustible = combustible;
        this.peso = peso;
    }
    public boolean puedeDespegar(){
        boolean puedeDespegar = true;
        String mensaje = "";
        if (combustible < COMBUSTIBLE_MINIMO || peso > PESO_MAXIMO){
            puedeDespegar = false;
            System.out.println("El cohete no puede despegar por que no cumple los requisitos minimos");
            return puedeDespegar;
        }else {
            System.out.println("El cohete ha despegado con exito");
            return puedeDespegar;
        }
    }
}

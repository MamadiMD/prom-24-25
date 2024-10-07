public class Agua {
    double temperatura;

    public Agua(double temperatura){
        this.temperatura = temperatura;
    }

    public void determinarEstado(){
        if (temperatura <= 0){
            System.out.println("El agua esta en estado solido");
        } else if (temperatura >= 100) {
            System.out.println("El agua esta en estado gaseoso");
        }else {
            System.out.println("El agua esta en estado liquido");
        }
    }
}
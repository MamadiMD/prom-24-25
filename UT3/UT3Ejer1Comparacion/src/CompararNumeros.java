public class CompararNumeros {
    int numero1;
    int numero2;

    public CompararNumeros(int numero1 , int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void comparar(){
        if (numero1 > numero2){
            System.out.println("El primer número es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor.");
        }else {
            System.out.println("Los dos números son iguales.");
        }
    }
}
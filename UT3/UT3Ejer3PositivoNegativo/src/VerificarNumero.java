public class VerificarNumero {
    int numero;

    public VerificarNumero(int numero){
        this.numero = numero;
    }

    public void verficar(){
        if (numero > 0){
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es 0");
        }
    }
}

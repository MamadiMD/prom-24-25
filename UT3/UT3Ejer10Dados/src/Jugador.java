import java.util.Random;

public class Jugador {
    private int dado1;
    private int dado2;
    private int dado3;

    public Jugador(){

    }
    public void tirarDados(){
        Random r = new Random();
        dado1 = r.nextInt(1,7);
        dado2 = r.nextInt(1,7);
        dado3 = r.nextInt(1,7);
    }
    public void determinarGanador(Jugador rival){
        tirarDados();
        rival.tirarDados();
        System.out.println("Dados jugador1 : " + dado1+" "+ dado2+" "+dado3 + " = "+ (dado1+dado2+dado3));
        System.out.println("Dados jugador2 : " + rival.dado1 +" "+ rival.dado2 +" "+ rival.dado3 +" = "+ (rival.dado1+ rival.dado2+ rival.dado3));
        if ((dado1+dado2+dado3) > (rival.dado1+ rival.dado2+ rival.dado3) || (dado1 == dado2 && dado1 == dado3)){
            System.out.println("El jugador1 ha ganado");
        }else if ((dado1+dado2+dado3) < (rival.dado1+ rival.dado2+ rival.dado3) || (rival.dado1 == rival.dado2 && rival.dado1 == rival.dado3)){
            System.out.println("El jugador2 ha ganado");
        }else {
            System.out.println("Empate");
        }
    }
}

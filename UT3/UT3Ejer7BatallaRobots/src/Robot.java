import java.util.Random;

public class Robot {
    int ataque;
    int vida;
    int defensa;
    String nombre;

    public Robot(String nombre , int vida){
        this.ataque = 0;
        this.defensa = 0;
        this.vida = vida;
        this.nombre = nombre;
    }

    public void combatir(Robot robotOponente){
        if (robotOponente.vida <= 0 || vida <= 0){
            System.out.println("El oponente a sido derrotado");
        }else {
            Random r = new Random();
            int numeroAleatorio1 = r.nextInt(1,9);
            int numeroAleatorio2 = r.nextInt(1,9);
            ataque = numeroAleatorio1;
            robotOponente.defensa = numeroAleatorio2;
            System.out.println("Ataque de " + nombre +":"+ ataque + "\nDefensa de "+ robotOponente.nombre + ":" + robotOponente.defensa);
            if (ataque > robotOponente.defensa){
                System.out.println(nombre + " ha conseguido realizar el ataque");
                robotOponente.vida -= (ataque - robotOponente.defensa);
                if (robotOponente.vida <= 0){
                    System.out.println(robotOponente.nombre + " ha sido derrotado");
                }else {
                    System.out.println("A "+ robotOponente.nombre + " le quedan " + robotOponente.vida + " de vida");
                }

            }
        }
    }
}

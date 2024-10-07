public class Main {
    public static void main(String[] args) {

        // Ejercicio 7
        Robot robot1 = new Robot("Messi", 10);
        Robot robot2 = new Robot("Ronaldo", 10);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
        robot1.combatir(robot2);
        robot2.combatir(robot1);
    }
}
package lab9.l9q4;

public class Tester {

    public static void main(String[] args) {

        // Test Game 1
        runGame1("Player 1", "Player 2");

        // Test Game 2
        runGame2("Player 3", "Player 4");
    }

    public static void runGame1(String name1, String name2) {

        diceGame1 p1 = new diceGame1(name1);
        diceGame1 p2 = new diceGame1(name2);

        while (true) {
            p1.roll(); p1.showPlayerScore(); if (p1.getPlayerScore() >= 100) { break; }
            p2.roll(); p2.showPlayerScore(); if (p2.getPlayerScore() >= 100) { break; }
        }

        System.out.printf("%s won!\n", (p1.getPlayerScore() >= 100) ? name1 : name2);
    }

    public static void runGame2(String name1, String name2) {

        diceGame2 p1 = new diceGame2(name1);
        diceGame2 p2 = new diceGame2(name2);

        while (true) {
            p1.roll(); p1.showPlayerScore(); if (p1.getPlayerScore() == 100) { break; }
            p2.roll(); p2.showPlayerScore(); if (p2.getPlayerScore() == 100) { break; }
        }

        System.out.printf("%s won!\n", (p1.getPlayerScore() >= 100) ? name1 : name2);
    }
}
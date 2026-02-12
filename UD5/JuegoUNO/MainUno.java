package JuegoUNO;

import java.util.Scanner;

public class MainUno {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        Game game = new Game();
        game.startGame();

        // COMIENZO DE PARTIDA
        System.out.println("COMIENZO DE PARTIDA");
        do {
            game.gameTurn();
            int playersCard = chooseCard();

            System.out.println("Pulsa ENTER para acabar su turno... ");
            sc.nextLine();
            game.nextTurn();
        } while (true);
    }

    public static int chooseCard() {
        System.out.print("Elige una carta para jugar (1-7): ");
        int chosenCard = sc.nextInt() - 1;
        if (chosenCard < 0 || chosenCard > 7) {
            do {
                System.out.print("Número incorrecto. Intenta otra vez:");
                chosenCard = sc.nextInt() - 1;
            } while (chosenCard < 0 || chosenCard > 7);
        }
        return chosenCard;
    }
}

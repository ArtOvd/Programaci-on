package JuegoUNO;

import java.util.ArrayList;
import java.util.Scanner;

public class MainUno {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        // COMIENZO DE PARTIDA
        System.out.println("COMIENZO DE PARTIDA");
        do {
            CardColor chosenColor = null;
            game.showRest();
            game.currentCard();
            game.currentPlayer();
            if (game.getCurrentColor() != null) {
                System.out.println("COLOR ACTUAL: " + game.getCurrentColor());
            }
            int currentHandSize = game.getPlayers().get(game.getCurrentPlayerIndex()).getHand().size();
            int playersChoice = turnOption(currentHandSize);
            if (playersChoice > 0) {
                while (!game.compareCards(playersChoice)) {
                    System.out.println("Jugada no valida. Intenta otra vez. ");
                    playersChoice = turnOption(currentHandSize);
                    if (playersChoice <= 0) {
                        break;
                    }
                }
            }
            game.playersTurn(playersChoice);
            game.messageUno();
            if (game.getCurrentCard().getColor().equals(CardColor.WILD)) {
                CardColor chosen = selectColor();
                game.setCurrentColor(chosen);
            }
            if (game.endGame()) {
                break;
            }
            game.nextTurn();
        } while (true);
    }

    public static int turnOption(int handSize) {
        System.out.println("Elige una opción: ");
        System.out.println(" 1 - 0 para robar: ");
        System.out.println(" 2 - De 1 a " + handSize + " para elegir una carta correspondiente. ");
        System.out.println(" 3 - -1 para saltar su turno.");
        System.out.print("Tu opción: ");
        int chosenCard = sc.nextInt();
        if (chosenCard == 0) {
            return chosenCard;
        }
        if (chosenCard == -1) {
            return chosenCard;
        }
        if (chosenCard < 0 || chosenCard > handSize) {
            do {
                System.out.print("Entrada no valida. Intenta otra vez: ");
                chosenCard = sc.nextInt();
            } while (chosenCard < 0 || chosenCard > handSize);
        }
        return chosenCard;
    }

    public static CardColor selectColor() {
        System.out.println("=== ELIGE UN COLOR ===");
        System.out.println(" 1 - RED");
        System.out.println(" 2 - BLUE");
        System.out.println(" 3 - GREEN");
        System.out.println(" 4 - YELLOW");
        System.out.print("Tu opción: ");
        while (true) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    return CardColor.RED;
                case 2:
                    return CardColor.BLUE;
                case 3:
                    return CardColor.GREEN;
                case 4:
                    return CardColor.YELLOW;
                default:
                    System.out.print("Opción no válida. Elige otro color:");
            }
        }

    }
}

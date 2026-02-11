package JuegoUNO;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean isBot;

    public boolean getBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    @Override
    public String printCards() {
        Card.printCardsArray(hand);
    }

    public Player() {
        isBot = false;
    }

    public Player(boolean isBot) {
        this.isBot = isBot;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public static void printHand(ArrayList<Card> hand) {
        if (hand.isEmpty()) {
            System.out.println("Your hand is empty.");
            return;
        }
        for (int i = 0; i < hand.size(); i++) {
            System.out.printf("    [%d]      ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (Card card : hand) {
                String[] lines = card.printCard().split("\n");
                System.out.print(lines[i] + "  ");
            }
            System.out.println();
        }
    }
}

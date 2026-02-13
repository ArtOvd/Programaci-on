package JuegoUNO;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();

    private String name;

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public static void printHand(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i += 12) {
            int end = Math.min(i + 12, hand.size());

            for (int j = i; j < end; j++) System.out.printf("    [%2d]     ", j + 1);
            System.out.println();

            for (int line = 0; line < 5; line++) {
                for (int j = i; j < end; j++) {
                    System.out.print(hand.get(j).printCard().split("\n")[line] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

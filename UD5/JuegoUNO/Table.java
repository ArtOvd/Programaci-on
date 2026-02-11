package JuegoUNO;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
    private ArrayList<Card> mainDeck;
    private ArrayList<Card> discardDeck;

    public Table() {
        mainDeck = new ArrayList<>();
        discardDeck = new ArrayList<>();
        generateNormalCards();
        generateSpecialCards();
        Collections.shuffle(mainDeck);
    }

    public ArrayList<Card> getMainDeck() {
        return mainDeck;
    }

    public void setMainDeck(ArrayList<Card> mainDeck) {
        this.mainDeck = mainDeck;
    }

    public ArrayList<Card> getDiscardDeck() {
        return discardDeck;
    }

    public void setDiscardDeck(ArrayList<Card> discardDeck) {
        this.discardDeck = discardDeck;
    }

    private void generateNormalCards() {
        for (CardColor color : CardColor.values()) {
            if (color == CardColor.WILD) {
                continue;
            }
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    mainDeck.add(new Card(color, i, CardType.NUMBER));
                } else {
                    for (int j = 0; j < 2; j++) {
                        mainDeck.add(new Card(color, i, CardType.NUMBER));
                    }
                }
            }
        }
    }

    private void generateSpecialCards() {
        for (CardColor color : CardColor.values()) {
            if (color == CardColor.WILD) {
                for (int i = 0; i < 4; i++) {
                    mainDeck.add(new Card(color, -1, CardType.SWITCH));
                    mainDeck.add(new Card(color, -1, CardType.DRAW4));
                }

            } else {
                for (int j = 0; j < 2; j++) {
                    mainDeck.add(new Card(color, -1, CardType.SKIP));
                    mainDeck.add(new Card(color, -1, CardType.DRAW2));
                    mainDeck.add(new Card(color, -1, CardType.REVERSE));
                }
            }
        }
    }
}

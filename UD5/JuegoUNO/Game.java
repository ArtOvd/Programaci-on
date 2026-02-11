package JuegoUNO;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Table table;
    private ArrayList<Player> players;
    private Card currentCard;

    public Game() {
        table = new Table();
        players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());
        currentCard = null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }



    public void startGame() {
        // Obtener carta del turno actual y moverla al descarte
        currentCard = table.getMainDeck().removeLast();
        table.getDiscardDeck().add(currentCard);
    }

    public void dealCards(Player player) {
        for (int j = 0; j < players.size(); j++) {
            for (int i = 0; i < 7; i++) {
                if (!table.getMainDeck().isEmpty()) {
                    player.getHand().add(table.getMainDeck().removeLast());
                }
            }
        }

    }


}

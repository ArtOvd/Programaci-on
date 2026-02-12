package JuegoUNO;

import java.util.ArrayList;

public class Game {
    private Table table;
    private ArrayList<Player> players;
    private Card currentCard;
    private int direction = 1;
    private int currentPlayerIndex = 0;

    public Game() {
        table = new Table();
        players = new ArrayList<>();
        Player p1 = players.add(new Player("Artem"));
        players.add(new Player("Vlad"));
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public void startGame() {
        // Repartir cartas a los jugadores
        dealCards();
        // Obtener carta del turno actual y moverla al descarte
        currentCard = table.getMainDeck().removeLast();
        table.getDiscardDeck().add(currentCard);
    }

    public void dealCards() {
        for (int j = 0; j < players.size(); j++) {
            Player p = players.get(j);
            for (int i = 0; i < 7; i++) {
                if (!table.getMainDeck().isEmpty()) {
                    p.getHand().add(table.getMainDeck().removeLast());
                }
            }
        }

    }

    public void gameTurn() {
        System.out.println("CARTA ACTUAL:");
        System.out.println(getCurrentCard().printCard());
        System.out.println("JUGADOR " + );
        System.out.println("TUS CARTAS:");
        Player.printHand(players.get(currentPlayerIndex).getHand());
    }

    public void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + direction + players.size()) % players.size();
    }

    public void placeCard(int pos) {

    }

    public boolean compareCards() {
        if (currentCard.getColor().equals(players.g)) {}
    }

}

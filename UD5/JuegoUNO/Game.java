package JuegoUNO;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Table table;
    private ArrayList<Player> players;
    private Card currentCard;
    private CardColor currentColor;
    private int direction = 1;
    private int currentPlayerIndex = 0;

    public Game() {
        table = new Table();
        players = new ArrayList<>();
        Player p1 = new Player("Artem");
        Player p2 = new Player("Vlad");
        players.add(p1);
        players.add(p2);
        currentCard = null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public CardColor getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(CardColor currentColor) {
        this.currentColor = currentColor;
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
        dealCards();
        // Obtener carta del turno actual y moverla al descarte
        currentCard = table.getMainDeck().removeLast();
        table.getDiscardDeck().add(currentCard);
        this.currentColor = currentCard.getColor();
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

    public void currentCard() {
        System.out.println("CARTA ACTUAL:");
        System.out.println(getCurrentCard().printCard());
    }

    public void currentPlayer() {
        System.out.println("=========================");
        System.out.println("JUGADOR: " + players.get(currentPlayerIndex).getName());
        System.out.println("=========================");
        System.out.println("TUS CARTAS:");
        Player.printHand(players.get(currentPlayerIndex).getHand());
    }

    public void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + direction + players.size()) % players.size();
    }

    public void placeCard(int pos) {
        Card playedCard = players.get(currentPlayerIndex).getHand().get(pos);
        players.get(currentPlayerIndex).getHand().remove(pos);
        setCurrentCard(playedCard);
        table.getDiscardDeck().add(playedCard);

        if (!playedCard.getColor().equals(CardColor.WILD)) {
            this.currentColor = playedCard.getColor();
        }

        if (playedCard.getColor().equals(CardColor.WILD)) {
            if (playedCard.getType().equals(CardType.DRAW4)) {
                int nextIdx = (currentPlayerIndex + direction + players.size()) % players.size();
                Player victim = players.get(nextIdx);
                for (int i = 0; i < 4; i++) {
                    if (table.getMainDeck().isEmpty()) newShuffle();
                    victim.getHand().add(table.getMainDeck().removeLast());
                }
                System.out.println("Jugador " + victim.getName() + " roba 4 y salta su turno.");
                nextTurn();
            }
        }

        if (playedCard.getType().equals(CardType.DRAW2)) {
            int nextIdx = (currentPlayerIndex + direction + players.size()) % players.size();
            Player victim = players.get(nextIdx);
            for (int i = 0; i < 2; i++) {
                if (table.getMainDeck().isEmpty()) newShuffle();
                victim.getHand().add(table.getMainDeck().removeLast());
            }
            System.out.println("Jugador " + victim.getName() + " roba 2 y salta su turno.");
            nextTurn();
        }

        if (playedCard.getType().equals(CardType.REVERSE)) {
            this.direction *= -1;
            if (players.size() == 2) {
                System.out.println("Reverse en partida de 2: saltas el turno del rival.");
                nextTurn();
            }
        }

        if (playedCard.getType().equals(CardType.SKIP)) {
            System.out.println("Salto de turno.");
            nextTurn();
        }
    }

    public boolean compareCards(int pos) {
        Card selectedCard = players.get(currentPlayerIndex).getHand().get(pos - 1);
        boolean colorMatch = selectedCard.getColor().equals(this.currentColor);
        boolean valueMatch = (selectedCard.getValue() == currentCard.getValue() && selectedCard.getValue() != -1);
        boolean typeMatch = selectedCard.getType().equals(currentCard.getType()) && !selectedCard.getType().equals(CardType.NUMBER);
        boolean isWild = selectedCard.getColor().equals(CardColor.WILD);
        return colorMatch || valueMatch || typeMatch || isWild;
    }

    public void playersTurn(int option) {
        if (option == 0) {
            if (!table.getMainDeck().isEmpty()) {
                players.get(currentPlayerIndex).getHand().add(table.getMainDeck().removeLast());
                return;
            } else {
                System.out.println("El mazo esta vacío. Barajando...");
                if (newShuffle()) {
                    players.get(currentPlayerIndex).getHand().add(table.getMainDeck().removeLast());
                } else {
                    System.out.println("No se puede robar más cartas.");
                    return;
                }
            }
            return;
        }
        if (option == -1) {
            return;
        }
        placeCard(option - 1);
    }

    public void showRest() {
        System.out.println("Cartas restantes: " + table.getMainDeck().size());
    }

    public boolean newShuffle() {
        if (table.getMainDeck().isEmpty() && table.getDiscardDeck().size() > 1) {
            table.getDiscardDeck().remove(currentCard);
            table.getMainDeck().addAll(table.getDiscardDeck());
            Collections.shuffle(table.getMainDeck());
            table.getDiscardDeck().clear();
            table.getDiscardDeck().add(currentCard);
            System.out.println("Mazo barajado!");
            return true;
        } else if (table.getDiscardDeck().isEmpty()) {
            System.out.println("No hay cartas para barajar!");
        }
        return false;
    }

    public boolean endGame() {
        if (players.get(currentPlayerIndex).getHand().isEmpty()) {
            System.out.println("EL JUGADOR " + players.get(currentPlayerIndex).getName().toUpperCase() + " HA GANADO!");
            return true;
        }
        return false;
    }

    public void messageUno() {
        if (players.get(currentPlayerIndex).getHand().size() == 1) {
            System.out.println("===========");
            System.out.println("|   UNO!  |");
            System.out.println("===========");
        }
    }
}

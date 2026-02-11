package JuegoUNO;

public class MainUno {

    static void main(String[] args) {
        Table table1 = new Table();
        Game game = new Game();
        game.startGame();
        Player yo = new Player();
        Player bot = new Player();
        game.dealCards(yo);
        int count = 0;
        Player.printHand(yo.getHand());
    }

}

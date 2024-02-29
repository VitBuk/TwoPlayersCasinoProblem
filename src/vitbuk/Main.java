package vitbuk;

import vitbuk.strategies.OddEven;
import vitbuk.strategies.SameLine;
import vitbuk.strategies.TwoPlayersStrategy;

public class Main {
    public static void main(String[] args) {
        Casino casino = Casino.getInstance();
        Player playerA = new Player("Alex");
        Player playerB = new Player("Beth");
        TwoPlayersStrategy strategy = new OddEven();
        Game game = new Game(casino, playerA, playerB, strategy);
        game.executeStrategy();
    }
}
package vitbuk;

import vitbuk.strategies.FirstTail;
import vitbuk.strategies.OddEven;
import vitbuk.strategies.SameLine;
import vitbuk.strategies.TwoPlayersStrategy;

public class Main {
    public static void main(String[] args) {
        hundredGames();
    }

    public static void hundredGames(){
        Casino casino = Casino.getInstance();
        int plusStrategyCount = 0;
        for (int i=0; i<Constants.gameSimulationAmount; i++) {
            Player playerA = new Player("Alex");
            Player playerB = new Player("Beth");
            TwoPlayersStrategy strategy = new FirstTail();
            Game game = new Game(casino, playerA, playerB, strategy);
            if (game.isPlusStrategy()) plusStrategyCount++;
        }
        System.out.println("In " +  Constants.gameSimulationAmount + " games:");
        System.out.println(plusStrategyCount + " had more than 50% wins");
    }
}
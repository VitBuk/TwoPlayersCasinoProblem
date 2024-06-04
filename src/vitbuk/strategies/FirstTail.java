package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Player;

public class FirstTail implements TwoPlayersStrategy{
    @Override
    public boolean isPlusStrategy(Casino casino, Player playerA, Player playerB) {
        // each player search for first tail in their list and name that number for other player list
        return false;
    }
}

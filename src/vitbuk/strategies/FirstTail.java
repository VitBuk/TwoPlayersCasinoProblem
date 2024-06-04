package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Player;

public class FirstTail implements TwoPlayersStrategy{
    @Override
    public boolean isPlusStrategy(Casino casino, Player playerA, Player playerB) {
        
        return false;
    }
}

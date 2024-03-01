package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Player;

public interface TwoPlayersStrategy {
    public boolean isPlusStrategy(Casino casino, Player playerA, Player playerB);
}

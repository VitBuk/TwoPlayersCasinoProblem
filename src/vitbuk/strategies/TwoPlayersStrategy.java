package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Player;

public interface TwoPlayersStrategy {
    public void execute(Casino casino, Player playerA, Player playerB);
}

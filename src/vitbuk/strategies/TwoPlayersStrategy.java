package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Player;

import java.util.List;

public interface TwoPlayersStrategy {
    public void execute(Casino casino, Player playerA, Player playerB);

    public boolean checkResult(List<String> listOfTosses, Player playerA, Player playerB);
}

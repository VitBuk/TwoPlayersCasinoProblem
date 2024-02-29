package vitbuk.strategies;


import vitbuk.Constants;
import vitbuk.Player;

import java.util.Random;

public class SameLine implements TwoPlayersStrategy {
    private Player playerA;
    private Player playerB;

    public void execute(Player playerA, Player playerB){
        Random random = new Random();
        int randNumber = random.nextInt(Constants.coinTossAmount);
        playerA.setGuess(randNumber);
        playerB.setGuess(randNumber);
        
    };

}

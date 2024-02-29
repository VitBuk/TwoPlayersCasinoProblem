package vitbuk.strategies;


import vitbuk.Casino;
import vitbuk.Constants;
import vitbuk.Player;

import java.util.Random;

public class SameLine implements TwoPlayersStrategy {

    public void execute(Casino casino, Player playerA, Player playerB){
        Random random = new Random();
        int randNumber;

        for (int i=0; i<Constants.coinTossAmount; i++) {
            randNumber = random.nextInt(Constants.coinTossAmount);
            playerA.setGuess(randNumber);
            playerB.setGuess(randNumber);
        }
    };

}

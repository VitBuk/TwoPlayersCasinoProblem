package vitbuk.strategies;


import vitbuk.Casino;
import vitbuk.Constants;
import vitbuk.Player;

import java.util.Random;

public class SameLine implements TwoPlayersStrategy {

    public void execute(Casino casino, Player playerA, Player playerB){
        Random random = new Random();
        int randNumber;
        int rightAmount = 0;
        int wrongAmount = 0;

        for (int i=0; i<Constants.simulationAmount; i++) {
            randNumber = random.nextInt(Constants.coinTossAmount);
            playerA.setGuess(randNumber);
            playerB.setGuess(randNumber);
            playerA.setCurrentList(casino.getNewListOfTosses());
            playerB.setCurrentList(casino.getNewListOfTosses());
            System.out.println(casino.checkGuesses(playerA, playerB));
            if (casino.checkGuesses(playerA, playerB)) rightAmount++;
            else wrongAmount++;
        }

        System.out.println("Right amount: " + rightAmount);
        System.out.println("Wrong amount: " + wrongAmount);
    };

}

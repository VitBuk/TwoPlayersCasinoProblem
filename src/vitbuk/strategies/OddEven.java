package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Constants;
import vitbuk.Player;

import java.util.List;
import java.util.Random;

public class OddEven implements TwoPlayersStrategy{
    public boolean isPlusStrategy(Casino casino, Player playerA, Player playerB) {
        int rightAmount = 0;
        int wrongAmount = 0;
        int guess = 1;

        for (int i = 0; i< Constants.simulationAmount; i++) {
            if (guess+1 > Constants.coinTossAmount-2) guess = 1;
            playerA.setGuess(guess);
            playerB.setGuess(guess+1);
            playerA.setCurrentList(casino.getNewListOfTosses());
            playerB.setCurrentList(casino.getNewListOfTosses());
            if (casino.checkGuesses(playerA, playerB)) rightAmount++;
            else wrongAmount++;

            guess +=2;
        }

        System.out.println("Right amount: " + rightAmount);
        System.out.println("Wrong amount: " + wrongAmount);
        return rightAmount > wrongAmount;
    }
}

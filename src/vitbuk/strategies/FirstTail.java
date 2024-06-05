package vitbuk.strategies;

import vitbuk.Casino;
import vitbuk.Constants;
import vitbuk.Player;

public class FirstTail implements TwoPlayersStrategy{
    @Override
    public boolean isPlusStrategy(Casino casino, Player playerA, Player playerB) {
        int rightAmount = 0;
        int wrongAmount = 0;

        for (int k=0; k<Constants.simulationAmount; k++) {
            playerA.setCurrentList(casino.getNewListOfTosses());
            playerB.setCurrentList(casino.getNewListOfTosses());

            for (int i=0; i < Constants.coinTossAmount; i++) {
                if (playerA.getCurrentList().get(i).equals(Constants.tail)) {
                    playerA.setGuess(i);
                    break;
                }
            }

            for (int j=0; j < Constants.coinTossAmount; j++) {
                if (playerB.getCurrentList().get(j).equals(Constants.tail)) {
                    playerB.setGuess(j);
                    break;
                }
            }

            if (casino.checkGuesses(playerA, playerB)) rightAmount++;
            else wrongAmount++;
        }

        System.out.println("Right amount: " + rightAmount);
        System.out.println("Wrong amount: " + wrongAmount);

        return rightAmount > wrongAmount;
    }
}

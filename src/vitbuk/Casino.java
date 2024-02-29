package vitbuk;

import java.util.ArrayList;
import java.util.List;

public final class Casino {
    private static Casino instance = new Casino();

    private Casino() {}

    public static Casino getInstance(){
        if (instance == null) instance = new Casino();
        return instance;
    }
    public List<String> getNewListOfTosses() {
        // 1000 tosses instead of infinity for simulation :)
        List<String> listOfTosses = new ArrayList<>(Constants.coinTossAmount);
        for (int i =0; i<Constants.coinTossAmount; i++) {
            if (Math.random() < 0.5 ) listOfTosses.add(Constants.head);
            else listOfTosses.add(Constants.tail);
        }

        return listOfTosses;
    }

    public boolean checkResult (Player playerA, Player playerB){
        return playerA.getCurrentList().get(playerB.getGuess())
                .equals(playerB.getCurrentList().get(playerA.getGuess()));
    }
}

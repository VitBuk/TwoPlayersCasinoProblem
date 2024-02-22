import java.util.ArrayList;
import java.util.List;

public class Casino {
    public List<String> getNewListOfTosses() {
        // 1000 tosses instead of infinity for simulation :)
        List<String> listOfTosses = new ArrayList<>(Constants.coinTossAmount);
        for (int i =0; i<Constants.coinTossAmount; i++) {
            if (Math.random() < 0.5 ) listOfTosses.add(Constants.head);
            else listOfTosses.add(Constants.tail);
        }
        
        return listOfTosses;
    }
}

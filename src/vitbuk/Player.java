package vitbuk;

import java.util.List;

public class Player {
    private String name;
    private List<String> currentList;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public List<String> getCurrentList() {
        return currentList;
    }

    public void setCurrentList(List<String> currentList) {
        this.currentList = currentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

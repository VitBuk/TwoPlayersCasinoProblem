import strategies.TwoPlayersStrategy;

public class Game {
    private Casino casino;
    private Player playerA;
    private Player playerB;
    private TwoPlayersStrategy strategy;

    public Game(Casino casino, Player playerA, Player playerB, TwoPlayersStrategy strategy) {
        this.casino = casino;
        this.playerA = playerA;
        this.playerB = playerB;
        this.strategy = strategy;
    }

    public Casino getCasino() {
        return casino;
    }

    public void setCasino(Casino casino) {
        this.casino = casino;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public TwoPlayersStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TwoPlayersStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

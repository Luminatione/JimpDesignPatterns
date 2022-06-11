package designPatterns.state.player2;

public class ActivePlayer implements  State{
    @Override
    public void addPoints(Integer ref, int amount) {
        ref+=amount;
    }
}

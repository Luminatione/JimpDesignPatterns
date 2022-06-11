package designPatterns.state.player2;

public class Gracz
{
    String name;
    Integer points;
    State state;

    public void addPoints(int amount)
    {
        state.addPoints(points, amount);
    }
    public int getPoints()
    {
        return points;
    }
    public void setState(State state)
    {
        this.state = state;
    }
}

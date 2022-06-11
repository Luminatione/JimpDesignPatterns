package designPatterns.state.player1;

import java.lang.ref.WeakReference;

public class Gracz
{
    static int count = 0;
    private String name;
    private int points;

    private Gracz(String name, int points)
    {
        this.name = name;
        this.points = points;
    }
    public static Gracz register(String name, int points)
    {
        if(count < 5)
        {
            count++;
            return new Gracz(name, points);
        }
        return null;
    }
    public static void unregister(Gracz gracz)
    {
        if(count > 0)
        {
            count--;
        }
        gracz = null;
    }
}

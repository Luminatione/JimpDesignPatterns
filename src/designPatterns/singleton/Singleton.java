package designPatterns.singleton;

public class Singleton {
    public static Singleton instance;
    int i;
    private Singleton()
    {
       i = 4;
    }
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

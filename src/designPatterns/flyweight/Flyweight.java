package designPatterns.flyweight;

public class Flyweight {
    FlyweightType type;
    int someUniqueProperty;

    public Flyweight(int a, FlyweightType type)
    {
        this.type = type;
        someUniqueProperty = a;
    }
}

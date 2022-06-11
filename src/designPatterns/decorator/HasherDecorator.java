package designPatterns.decorator;

public class HasherDecorator extends Hasher {
    Hasher hasher;
    public HasherDecorator(Hasher hasher)
    {
        this.hasher = hasher;
    }
    @Override
    public void hash() {
        hasher.hash();
    }
}

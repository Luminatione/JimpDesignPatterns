package designPatterns.decorator;

public class HashWithSalt extends HasherDecorator {
    public HashWithSalt(Hasher hasher) {
        super(hasher);
    }
    public void addSalt()
    {

    }
    @Override
    public void hash() {
        addSalt();
        super.hash();
    }
}

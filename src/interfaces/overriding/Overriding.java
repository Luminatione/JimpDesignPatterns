package interfaces.overriding;

public class Overriding {
    Integer a;
    @Override
    public String toString() {
        return a.toString();
    }

    @Override
    public int hashCode() {
        return a.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Overriding && a.equals(((Overriding)obj).a);
    }
}

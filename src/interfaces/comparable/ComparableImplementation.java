package interfaces.comparable;

public class ComparableImplementation implements Comparable<ComparableImplementation> {
    Integer a;
    
    @Override
    public int compareTo(ComparableImplementation o) {
        return this.a - o.a;
        // jeżeli String a to this.a.compareTo(o.a);
    }
}

package interfaces.comparable;

public class ComparableImplementation implements Comparable<ComparableImplementation> {
    Integer a;
    @Override
    public int compareTo(ComparableImplementation o) {
        if(a.compareTo(o.a) < 0)
        {
            return -1;

        }
        else if(a.compareTo(o.a) > 0)
        {
            return 1;
        }
        return 0;
    }
}

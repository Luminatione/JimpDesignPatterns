package interfaces.iterable;

import java.util.Iterator;
import java.util.List;

public class IterableImplementation implements Iterable<Integer>{
    List<Integer> a;
    @Override
    public Iterator<Integer> iterator() {
        return a.iterator();
    }

}

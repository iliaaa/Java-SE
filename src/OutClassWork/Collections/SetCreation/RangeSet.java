package OutClassWork.Collections.SetCreation;

import java.util.AbstractSet;
import java.util.Iterator;;

public class RangeSet extends AbstractSet<Integer> {
    int fromInclusive;
    int toExclusive;

    public RangeSet(int fromInclusive, int toExclusive) {
        this.fromInclusive = fromInclusive;
        this.toExclusive = toExclusive;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(fromInclusive, toExclusive);
    }

    @Override
    public int size() {
        return toExclusive - fromInclusive;
    }
}

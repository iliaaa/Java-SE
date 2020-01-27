package OutClassWork.Collections.SetCreation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterator<Integer> {
    int fromInclusive;
    int toExclusive;
    int next;

    public RangeIterator(int fromInclusive, int toExclusive) {
        this.fromInclusive = fromInclusive;
        this.toExclusive = toExclusive;
        this.next = fromInclusive;
    }

    @Override
    public boolean hasNext() {
        return next != toExclusive;
    }

    @Override
    public Integer next() {
        if (next == toExclusive) {
            throw new NoSuchElementException();
        }
        return next++;
    }
}

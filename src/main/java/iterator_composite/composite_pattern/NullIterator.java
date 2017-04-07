package iterator_composite.composite_pattern;

import javax.naming.OperationNotSupportedException;
import java.util.Iterator;

/**
 * Created by nghiapv on 07/04/2017.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

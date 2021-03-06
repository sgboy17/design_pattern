package iterator_composite.composite_pattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by nghiapv on 07/04/2017.
 */
public class CompositeIterator implements Iterator{
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) {
            return false;
        }else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }
}

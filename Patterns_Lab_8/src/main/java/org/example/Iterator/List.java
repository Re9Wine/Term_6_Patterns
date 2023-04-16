package org.example.Iterator;

import org.example.Iterator.ICollection;
import org.example.Iterator.IIterator;

import java.util.NoSuchElementException;

public class List<T> implements ICollection {
    private T[] values;

    public void add(T entity){
        if(values == null){
            values = (T[]) new Object[1];

            values[0] = entity;
        }
        else{
            var newValues = new Object[values.length + 1];

            for (int i = 0; i < newValues.length; i++) {
                if(i == newValues.length - 1){
                    newValues[i] = entity;
                }
                else {
                    newValues[i] = values[i];
                }
            }

            values = (T[]) newValues;
        }
    }

    @Override
    public IIterator getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements IIterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < values.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return values[index++];
            }

            throw new NoSuchElementException();
        }
    }
}

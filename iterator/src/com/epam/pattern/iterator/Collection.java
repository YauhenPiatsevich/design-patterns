package com.epam.pattern.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Collection<T> {

    private final List<T> list;

    public Collection(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public Iterator<T> getIterator() {
        return new CollectionIterator();
    }

    class CollectionIterator implements Iterator<T> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list.get(cursor++);
        }
    }
}

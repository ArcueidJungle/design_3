package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {

    private int[] data;
    private int index;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        int i = cicl(index);
        return i < data.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        index = cicl(index);
        return data[index++];
    }

    private int cicl(int i) {
        while ((i < data.length) && (data[i] % 2 != 0)) {
            i++;
        }
        return i;
    }
}
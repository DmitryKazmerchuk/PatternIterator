package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class IntIterator implements Iterator<Integer> {

    protected int min;
    protected int max;
    protected int rndNum;
    protected Random random = new Random();

    public IntIterator(int min, int max, int rndNum) {
        this.min = min;
        this.max = max;
        this.rndNum = rndNum;
    }

    @Override
    public boolean hasNext() {
        if (rndNum >= min && rndNum < max + 1) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (rndNum >= min && rndNum < max + 1) {
            rndNum = random.ints(min, max + 1).findFirst().getAsInt();
            return rndNum;
        }
        return 0;
    }
}

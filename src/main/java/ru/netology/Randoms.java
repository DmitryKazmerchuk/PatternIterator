package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int max;
    protected int rndNum;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        rndNum = random.ints(min, max + 1).findFirst().getAsInt();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator(min, max, rndNum);
    }
}
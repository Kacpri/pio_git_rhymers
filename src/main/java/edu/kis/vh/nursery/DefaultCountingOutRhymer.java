package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    public static final int INDEX = -1;
    private int[] numbers = new int[CAPACITY];

    private int total = INDEX;

    private static final int EMPTY = INDEX;
    

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final boolean callCheck() {
        return total == INDEX;
    }

    final boolean isFull() {
        return total == CAPACITY -1;
    }

    int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    final public int getTotal() {
        return total;
    }
}

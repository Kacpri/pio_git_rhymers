package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int empty= -1;
    public static final int full = 11;
    private int[] numbers = new int[INT];

    private int total = empty;
    

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final boolean callCheck() {
        return total == empty;
    }

    final boolean isFull() {
        return total == full;
    }

    int peekaboo() {
        if (callCheck())
            return empty;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return empty;
        return numbers[total--];
    }

    final public int getTotal() {
        return total;
    }
}

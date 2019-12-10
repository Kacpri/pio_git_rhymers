package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    private int[] numbers = new int[INT];

    private int total = INT1;
    

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final boolean callCheck() {
        return total == INT1;
    }

    final boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return INT1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return numbers[total--];
    }

    final public int getTotal() {
        return total;
    }
}

package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int CAPACITY = 12;
    private static final int INDEX = -1;
    private final int[] numbers = new int[CAPACITY];
    static final int EMPTY_VALUE = -1;

    private int total = INDEX;

    final boolean isEmpty() {
        return total == INDEX;
    }

    final int top() {
        return numbers[total];
    }

    final int pop() {
        return numbers[total--];
    }

    final void push(int number){
        numbers[++total] = number;
    }

    final boolean isFull() {
        return total == CAPACITY -1;
    }

    final public int getTotal() {
        return total;
    }
}

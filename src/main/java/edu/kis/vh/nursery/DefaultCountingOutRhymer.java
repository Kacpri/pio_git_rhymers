package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IntLinkedList list;
    private static final int EMPTY_VALUE = -1;

    public DefaultCountingOutRhymer() {
        this.list = new IntLinkedList();
    }

    final boolean callCheck() {
        return list.isEmpty();
    }

    int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return list.top();
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return list.pop();
    }

    public void countIn(int in) {
        if (!list.isFull())
            list.push(in);
    }

    final boolean isFull() {
        return list.isFull();
    }
}

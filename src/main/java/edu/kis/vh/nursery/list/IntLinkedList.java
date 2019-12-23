package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class represents linked list of integers.
 * The class IntLinkedList contains methods for adding and removing numbers as well as checking is the list is empty or full.
 */
public class IntLinkedList {
    /**
     * Represents the last element of the list
     */
    private Node last;
    /**
     * Value returned if the list is empty
     */
    private final static int EMPTY_VALUE = -1;

    /**
     * Adds given integer to the list
     * @param i The given integer
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Returns true if, and only if, Node last is null which means that the list does not contain anything.
     * @return True if last node is null otherwise false
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Always returns false because the list cannot be full.
     * @return Always false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns value of the last element of the list. If the list is empty returns -1.
     * @return If the list is empty -1, otherwise value of last element
     */
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }
    /**
     * Returns value of the last element of the list and removes it. If the list is empty returns -1.
     * @return If the list is empty -1, otherwise value of last element.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * The Node class represents element of the list and is used to store value (int) and references to the previous and the next element of the list
     */
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Creates a new node with given integer value
         * @param i Integer value to be stored in the node
         */
        Node(int i) {
            value = i;
        }

        /**
         * Returns value of the node
         * @return Value of the node
         */
        int getValue() {
            return value;
        }

        /**
         * Returns the previous node
         * @return The previous node
         */
        Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node
         * @param prev Node to be set
         */
        void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the next node
         * @return The next node
         */
        Node getNext() {
            return next;
        }
        /**
         * Sets the next node
         * @param next Node to be set
         */
        void setNext(Node next) {
            this.next = next;
        }
    }
}

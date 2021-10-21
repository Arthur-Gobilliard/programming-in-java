package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * adds an element at the beginning of the list
     * @param x
     */

    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    /**
     * removes an element at the end of the list
     * @return E
     */

    @Override
    public E dequeue() {

        if (!elems.isEmpty()) {
            return elems.removeLast();
        }
        throw new IllegalStateException("Empty");

    }

    /**
     * returns the number of elements
     * @return int
     */

    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     * returns the first element without deleting it
     * @return E
     */

    @Override
    public E peek(){
        if (!isEmpty()){
            return elems.getLast();
        }
        throw new RuntimeException("null");
    }

    /**
     *
     * @return a tring of the queue
     */

    @Override
    public String toString(){
        return "Queue{" + elems.toString() + "}";
    }
}

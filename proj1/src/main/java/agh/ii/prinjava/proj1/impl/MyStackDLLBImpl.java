package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.w3c.dom.Node;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     *deletes the last element
     * @return the deleted elem
     */

    @Override
    public E pop() {
        if (!elems.isEmpty()){
            return elems.removeLast();
        }
        throw new RuntimeException("null");
    }

    /**
     * pushes element to the end
     * @param x
     */

    @Override
    public void push(E x) {
        elems.addLast(x);
    }
    /**
     * returns numer of ints
     * @return int
     */

    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     * returns the fist element  without deleting it
     * @return any type
     */

    @Override
    public E peek() {
        return elems.peek();
    }

    /**
     *
     * @return string of the stack
     */

    @Override
    public String toString(){
        return "Stack{" + elems.toString() + "}";
    }
}

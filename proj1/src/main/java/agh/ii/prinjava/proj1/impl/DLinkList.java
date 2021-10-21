package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first; //first element added
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    public boolean isEmpty() {
        return first.elem == null;
    }

    /**
     * adds at the beginning of the list
     * @param elem
     */

    public void addFirst (E elem){
        if (isEmpty()){
            first.elem = elem;
            first.next = null;
            first.prev = null;
        }
        else {
            Node<E> newNode = new Node<E>();
            newNode.next = first;
            first.prev = newNode;
            newNode.elem = elem;
            first = newNode;
        }
    }

    /**
     * adds at the end of the list
     * @param elem
     */

    public void addLast(E elem){
        if (isEmpty()){
            first.elem = elem;
            first.next = null;
            first.prev = null;
        }
        else {
            Node<E> temp = first;
            while (temp.next != null){
                temp = temp.next;
            }
            Node<E> newNode = new Node<E>();
            newNode.prev = temp;
            temp.next = newNode;
            newNode.elem = elem;
        }
    }

    /**
     * deletes at the beginning
     * @return Node
     * returns the deleted node
     */

    public E removeFirst (){
        Node<E> toDelete = first;
        if (!isEmpty() || first.next != null) {
            first.prev = null;
            return toDelete.elem;
        }
        first = first.next;
        first.prev = null;
        return toDelete.elem;
    }

    /**
     * deletes at the end
     * @return Node
     * returns the deleted node
     */

    public E removeLast (){
        Node<E> toDelete = first;
        if (!isEmpty() || first.next != null) {
            first.prev = null;
            return toDelete.elem;
        }
        while (toDelete.next != null){
            toDelete = toDelete.next;
        }
        Node<E> temp = toDelete.prev;
        temp.next = null;
        return toDelete.elem;
    }

    @Override
    public String toString() {
        Node<E> temp = first;
        String tostring = "DlinkList";
        while (temp.next != null) {
            tostring += temp.elem + " / ";
            temp = temp.next;
        }
        return tostring + "}";
    }

    int numOfElems(){
        if(first.elem == null){
            return 0;
        }
        else{
            int counter = 1;
            Node<E> temp = first;
            while(temp.next != null) {
                counter++;
                temp = temp.next;
            }
            return counter;
        }
    }

    public E peek (){
        if  (!isEmpty()){
            return first.elem;
        }
        throw new IllegalStateException("Nothing here");

    }

}




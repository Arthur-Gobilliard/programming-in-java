package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first = new Node<E>();
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

    public void addFirst(E elem){

        if (!isEmpty()){
            Node<E> newNode = new Node<>();
            newNode.elem = elem;
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }

        else{
            first.elem = elem;
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
        else{
            Node<E> temp = new Node<E>();
            temp = first;
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

    public E removeFirst(){
        Node<E> delete = first;
        if(isEmpty()) {
            return null;
        }
        else if(first.next==null){
            first = null;
            return delete.elem;
        }
        first = first.next;
        first.prev = null;
        return delete.elem;
    }

    /**
     * deletes at the end
     * @return Node
     * returns the deleted node
     */

    public E removeLast(){
        Node<E> delete = first;
        if(isEmpty()) {
            return null;
        }
        while(delete.next !=null){
            delete = delete.next;
        }
        Node<E> temp = delete.prev;
        temp.next=null;
        return delete.elem;
    }

    public E getLast(){
        Node<E> temp = first;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.elem;
    }

    /**
     *
     * @return tostring
     * converts a node into a string
     */

    @Override
    public String toString() {
        Node<E> temp = first;
        String stringnode = "DLinkList{ ";
        if (!isEmpty()) {
            while (temp != null) {
                stringnode += temp.elem + " ";
                temp = temp.next;
            }
        }
        return stringnode + "}";
    }

    /**
     *
     * @return int, the number of elements in the list
     */

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

    /**
     *
     * @return the first node of the list without deleting it
     */

    public E peek(){
        if (!isEmpty()){
            return first.elem;
        }
        throw new RuntimeException("null");
    }

}




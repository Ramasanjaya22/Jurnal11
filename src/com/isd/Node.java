package com.isd;

public class Node <E extends Comparable<E>>{
    private final E alfabet;
    private Node<E>left;
    private Node<E>right;

    public Node(E element){
        alfabet = element;
        left = right = null;
    }

    public E getAlfabet() {
        return alfabet;
    }

    public Node<E> getLeft() {
        return left;
    }
    public Node<E> getRight() {
        return right;
    }
    public void insert(E value){
        if (value.compareTo(alfabet)<0) {
            if (left == null) {
                left = new Node<>(value);
                System.out.println(value + " data masuk ke left child dari " + alfabet);
            } else{
                left.insert(value);
            }
        } else if (value.compareTo(alfabet)>0) {
            if (right == null) {
                right = new Node<>(value);
                System.out.println(value + " data masuk ke right child dari " + alfabet);
            } else{
                right.insert(value);
            }
        }
    }
}

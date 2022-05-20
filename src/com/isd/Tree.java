package com.isd;

public class Tree <E extends Comparable<E>>{
    private Node<E> root;
    public Tree(){
        root = null;
    }
    public void InsertNode(E tambahdata){
        if (root == null) {
            root = new Node<>(tambahdata);
            System.out.println(tambahdata + " adalah root");
        }else{
            root.insert(tambahdata);
        }
    }
    public void searchBST(E key){
        boolean hasil = searchBSTHelper(root, key);
        if(hasil)
            System.out.println("Node " + key + " ditemukan");
        else
            System.out.println("Node " + key + " tidak ditemukan");
    }

    public boolean searchBSTHelper(Node<E> node, E key){
        boolean result = false;
        if(node!=null){
            if(key.equals(node.getAlfabet()))
                result = true;
            else if(key.compareTo(node.getAlfabet())<0)
                result = searchBSTHelper(node.getLeft(),key);
            else
                result = searchBSTHelper(node.getRight(),key);
        }
        return result;
    }


}

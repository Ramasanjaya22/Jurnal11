package com.isd;

public class Main {

    public static void main(String[] args) {
	Tree<String> binaryTree = new Tree<>();
        //insert node
        binaryTree.InsertNode("F");
        binaryTree.InsertNode("E");
        binaryTree.InsertNode("H");
        binaryTree.InsertNode("D");
        binaryTree.InsertNode("G");
        binaryTree.InsertNode("C");
        binaryTree.InsertNode("B");
        binaryTree.InsertNode("H");
        binaryTree.InsertNode("K");
        binaryTree.InsertNode("J");
        //search node
        binaryTree.searchBST("K");
        binaryTree.searchBST("A");
    }

}

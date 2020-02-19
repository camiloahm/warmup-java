package com.crack.graph;

public class MinimalTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node insertNode(int start, int end, int[] members) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node treeNode = new Node(members[mid]);
        treeNode.left = insertNode(start, mid - 1, members);
        treeNode.right = insertNode(mid + 1, end, members);
        return treeNode;
    }

    void preOrder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        MinimalTree tree = new MinimalTree();
        Node root = tree.insertNode(0, array.length - 1, array);
        tree.preOrder(root);
    }

}

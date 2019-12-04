package com.crack;

public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    void appendToTail(int newValue) {

        Node newEndNode = new Node(newValue);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = newEndNode;
    }

    Node removeNode(Node head, int d) {

        Node n = head;
        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }




}

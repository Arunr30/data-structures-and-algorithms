package Linked_List;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.val + " ->");
                node = node.next;
            } while(node != head);
        }
    }
    public void delete(int val) {
        
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}

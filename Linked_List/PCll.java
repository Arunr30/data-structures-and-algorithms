package Linked_List;

public class PCll {
    private Node head;
    private Node tail;
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

    public void delete(int val) {
        Node node = head;
        if(node == null) {
            System.out.println("Not exist!");
            return;
        }
        if(head.val == val) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if(n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);


    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + "->");
            temp = temp.next;
        } while(temp != head);
    }






    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}

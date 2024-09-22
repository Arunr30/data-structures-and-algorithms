package Linked_List;

public class PracticeDll {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        node.prev = null;
        if(head == null) {
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    // finding a particular Node
    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int prevNode, int val) {
        Node p = find(prevNode);
        if(p == null) {
            System.out.println("node not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node temp = head;
//        Node last = null;
        while(temp != null) {
            System.out.print(temp.val + "->");
//            last = temp;
            temp =temp.next;
        }
//        System.out.println("END");
//        System.out.println("Printing in reverse");
//        while(last != null) {
//            System.out.print(last.val + "->");
//            last = last.prev;
//        }
//        System.out.println("START");
    }




    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

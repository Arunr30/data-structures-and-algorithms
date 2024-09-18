package Linked_List;
//
//public class PracticeLL {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public PracticeLL() {
//        this.size = 0;
//    }
//
//    // inserting a node in last
//    public void insertLast(int val) {
//        if(tail == null) {
//            insertFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//    // inserting a node in first;
//    public void insertFirst(int val) {
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//        if(tail == null) {
//            tail = head;
//        }
//        size++;
//    }
//
//    public void insert(int val, int index) {
//        if(head == null) {
//            insertFirst(val);
//            return;
//        }
//        if(index == size) {
//            insertLast(val);
//            return;
//        }
//        Node temp = head;
//        for(int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//        Node node = new Node(val, temp.next);
//        temp.next = node;
//        size++;
//    }
//
//    // delete first node
//
//    public int deleteFirst() {
//        int val = head.val;
//        head = head.next;
//        if(head == null) {
//            tail = null;
//        }
//        size--;
//        return val;
//    }
//
//    // delete last node;
//
//    public int deleteLast() {
//        Node secondLast = get(size - 2);
//        int val = tail.val;
//        tail = secondLast;
//        tail.next = null;
//        return val;
//    }
//
//    // delete via index.
//
//    public int deleteIndex(int index) {
//        if(index == 0) {
//            deleteFirst();
//        }
//        if(index == size - 1) {
//            deleteLast();
//        }
//        Node prev = get(index - 1);
//        int val = prev.next.val;
//        prev.next = prev.next.next;
//        return val;
//    }
//
//   public Node get(int index) {
//        Node node = head;
//        for(int i = 0; i < index; i++) {
//            node = node.next;
//        }
//        return node;
//   }
//
//// display
//    public void display() {
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.val + " ->");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
//
//    private class Node {
//        private int val;
//        private Node next;
//
//        public Node(int val) {
//            this.val = val;
//        }
//        public Node(int val, Node next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//}

//public class PracticeLL {
//    private Node head;
//    private int size;
//
//    public void insertFirst(int val) {
//        Node node = new Node(val);
//        node.next = head;
//        node.prev = null;
//        if(head != null) {
//            head.prev = node;
//        }
//        head = node;
//
//    }
//
//    public void display() {
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.val + " ->");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
//
//    public void insertLast(int val) {
//        Node node = new Node(val);
//        Node last = head;
//        node.next = null;
//        if(head == null) {
//            node.prev = null;
//            head = node;
//            return;
//        }
//        last.next = node;
//        node.prev = last;
//        while(last.next != null) {
//            last = last.next;
//        }
//    }
//
//
//    private class Node {
//        private int val;
//        private Node next;
//        private Node prev;
//
//        public Node(int val) {
//            this.val = val;
//        }
//        public Node(int val, Node next, Node prev) {
//            this.val = val;
//            this.next = next;
//
//            this.prev = prev;
//
//        }
//    }
//}
//
//

public class PracticeLL {
    public class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
            prev = null;
            next = null;
        }
    }
}



package Linked_List;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    LL() {
        this.size = 0;
    }
  // insert the node in Last;
//  public void insertLast(int val) {
//        if(tail == null) {
//            insertFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size++;
//  }
//// insert in index
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
//
//        size++;
//    }

// inserting the node in the first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }
//
//    // delete the first node
//    public int deleteFirst() {
//        int val = head.value;
//        head = head.next;
//        if(head == null) {
//            tail = null;
//        }
//        size --;
//        return val;
//    }
//
//    // delete last node
//    public int secondLast() {
//        Node secondNode = get(size - 2);
//        int val = tail.value;
//        tail = secondNode;
//        tail.next = null;
//        return val;
//    }
//
//    // deleting via index;
//    public int delete(int index) {
//        if(index == 0) {
//            return deleteFirst();
//        }
//        if(index == size - 1) {
//            return secondLast();
//        }
//        Node prev = get(index - 1);
//        int val = prev.next.value;
//        prev.next = prev.next.next;
//        return val;
//    }
//
//    public Node get(int index) {
//        Node node = head;
//        for(int i = 0; i < index; i++) {
//            node = node.next;
//        }
//        return node;
//    }
//    // finding
//    public Node find(int value) {
//        Node node = head;
//        while (node != null) {
//            if(node.value == value) {
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }



    // displaying the node
    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

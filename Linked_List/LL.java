package Linked_List;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    LL() {
        this.size = 0;
    }
  // insert the node in Last;

  public void insertLast(int val) {
        if(tail == null) {
            insertNode(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
  }

// insert in index

    public void insert(int val, int index) {
        if(head == null) {
            insertNode(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }




// inserting the node in the first

    public void insertNode(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }
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

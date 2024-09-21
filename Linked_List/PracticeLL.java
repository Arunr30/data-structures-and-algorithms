package Linked_List;

public class PracticeLL {
    private Node head;
    private Node tail;
    private int size;

    PracticeLL() {
        this.size = 0;
    }

    // inserting first.
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

// insert the val in last
    public void insertLast(int val) {
        Node node = new Node(val);
        if(tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // inserting via index.
    public void insert(int val, int index) {
        if(head == null) {
            insertFirst(val);
            return;
        }
        if(size == index) {
            insertLast(val);
            return;
        }
        Node temp = head;
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    // displaying the linked list.
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
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
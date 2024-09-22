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
    // delete first node
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // delete last node;

    public int deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete via index

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

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
package Linked_List;

public class Dll {
    public static void main(String[] args) {
            Node val1 = new Node(1);
            Node val2 = new Node(2);
            Node val3 = new Node(3);

            val1.next = val2;
            val2.prev = val1;

            val2.next = val3;
            val3.prev = val2;

            Node temp = val1;
            while(temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
        System.out.println("END");

            temp = val3;
            while(temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.prev;
            }
        System.out.println("Start");
    }
    public void tfb(Node node) {
        while(node.prev != null) {
            node = node.prev;
        }
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}

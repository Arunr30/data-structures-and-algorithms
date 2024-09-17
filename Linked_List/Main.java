package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertNode(5);
        list.insertNode(6);
        list.insertLast(99);
        list.insert(2, 1);
        list.display();
    }
}

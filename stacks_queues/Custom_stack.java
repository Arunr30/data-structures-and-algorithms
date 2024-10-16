package stacks_queues;

public class Custom_stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    public Custom_stack() {
        this(DEFAULT_SIZE);
    }
    int ptr = -1;
    public Custom_stack(int size) {
        this.data = new int[size];
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("stack is empty!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is Full!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}

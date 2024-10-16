package stacks_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(21);
//        stack.push(22);
//        stack.push(23);
//
//        System.out.println( stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(21);
        queue.add(22);
        // peek --> only retrieves the first element not remove
//        System.out.println(queue.peek());
        // remove --> remove will remove the first element
//        System.out.println(queue.remove());
        // poll will retrieve and removes the first element if the head(first element) is none, it simply returns null.
//        System.out.println(queue.poll());
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());


    }
}

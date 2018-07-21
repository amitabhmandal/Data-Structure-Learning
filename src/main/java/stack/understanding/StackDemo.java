package stack.understanding;

import java.util.Stack;
import java.util.Vector;

//LIFO 
public class StackDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.size());

    }

}

// Java code for stack implementation

// The Stack class represents a last-in-first-out (LIFO) stack of objects.
// It extends class Vector with five operations that allow a vector to be treated as a stack.
// The usual push and pop operations are provided, as well as a method to peek at the top
// item on
// the stack, a method to test for whether the stack is empty, and a method to search the
// stack for an item and discover how far it is from the top.
// When a stack is first created, it contains no items.

class Test {
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop :");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}

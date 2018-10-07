package stack.learning;

public class StackLearning {

    public static void main(String[] args) {
        stackArrayImplementationTester();
    }
    
    public static String reverseString(String str) {
        return str;
    }

    public static void stackArrayImplementationTester() {
        StackArrayImplementation stackArrayImplementation = new StackArrayImplementation(10);
        stackArrayImplementation.push(20);
        stackArrayImplementation.push(10);
        stackArrayImplementation.push(99);
        stackArrayImplementation.push(44);
        stackArrayImplementation.push(1001);
        stackArrayImplementation.push(45);
        stackArrayImplementation.push(11);
        stackArrayImplementation.display();

    }
}

// Important Points
// 1. Example: Tower of things.
// 2. Item that was last inserted is the top of stack
// 3. This is Called as LIFO(Last In First Out)
// 4. When we place an element on top of the stack is called - PUSH
// 5. When we remove an element from the top of the stack is called - POP
// 6. Everything in Array starts with a zero
// 7. Since the top of stack is represented =-1 as there is nothing in the top of
// stack hence cannot be assigned a value = 0. thus it has to be -1
// 8. Important point about stack array implementation, nothing is being deleted from
// the stack, but everything is controlled by top index pointer. Thus everything
// will be replaced by the value pointed by the 'top' pointer.
class StackArrayImplementation {

    private int maxSize;
    // will be acting as the container in which stack elements will be stored
    private long[] stackArray;
    // will represent the index position of the last item that was placed on top of the stack
    private int top;

    // stack needs to be initialized with some size
    // hence we can use constructor for it

    public StackArrayImplementation(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    // since push does not return anything hence it's type is void
    // when we push something into the stack then we will increase the top pointer
    //
    public void push(long value) {
        top++;
        stackArray[top] = value;
    }

    // this method will remove the element from the top of the stack
    // hence top-- will happen
    // as nothing is happening to the array hence everything needs to be controlled
    // by the 'top' pointer.
    public long pop() {
        int oldTop = top;
        top--;
        return this.stackArray[oldTop];
    }

    // through this method nothing shall be removed but the current top of stack
    // value will be returned.
    public long peek() {
        return this.stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // top represents the position
    // since it is zero based
    // hence the maxSize - 1 is the maximum number of
    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public void display() {
        if (isEmpty()) {
            return;
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(this.stackArray[i]);
            }
        }
    }

}

package circular.linkedlist.learning;


//Disadvantage of using LinkedList is 
//1. When we have to insert something at the end then we need to iterate 
//   till the end and hence make it is in-efficient.
//2. Circular Linkedlist concept
//   just as we have node pointing to the first 'node' called first
//   we have node pointing to the last of the 'node' called last
//   Thus the beginning and end of the list can be met by circular linked list
//
//
//3. Using circular linked List we can implement the stack and queue.
//   Since we have the pointer first and last hence it makes easier to manage 
//   the positions of the nodes. Thus we are able to insert/delete at the beginning
//   also we are able to insert delete at the end.

public class CircularLinkedList {
    
    private Node first;
    private Node last;
    

    public CircularLinkedList() {
        first = null;
        last = null;
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        // if(isEmpty()) {
        // last = newNode;
        // }
        
    }
    public static void main(String[] args) {

    }

    
    
}

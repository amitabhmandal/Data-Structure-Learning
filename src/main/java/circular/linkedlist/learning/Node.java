package circular.linkedlist.learning;


//This class is called a soft referential class or revcursive class
public class Node {
    int data;
    Node next = null;
    
    public void displayNodeInformation() {
        System.out.print("{ data = " + data + " } " );
    }
}

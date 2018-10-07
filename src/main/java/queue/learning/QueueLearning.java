package queue.learning;

public class QueueLearning {

    public static void main(String[] args) {
        queueArrayImplementationExample();

    }

    public static void queueArrayImplementationExample() {
        QueueArrayImplementation queueArrayImplementation = new QueueArrayImplementation(5);
        queueArrayImplementation.insert(4);
        queueArrayImplementation.insert(14);
        queueArrayImplementation.insert(9);
        queueArrayImplementation.insert(20);
        queueArrayImplementation.insert(500);
        queueArrayImplementation.insert(12);

        queueArrayImplementation.display();
    }

}

// Important Points
// 1. In queue first item inserted is the first item to be addressed
// 2. Exemplifies first come first serve rule = FIFO(FIRST IN FIRST OUT)
// 3. example: print jobs, phone calls to be answered in customer call centre
// 4. Insertion should always happen from the end of the queue. For example
// if we are standing in the line then people join the queue from the back
// of the queue.
// 5. Deletion shall always happen from the front of the queue. Example we will get
//    removed from the line from the front of the line
// 6. Types of queue.


class QueueArrayImplementation {

    private int maxSize;
    private long[] queueArray;

    // this will be the index position for the element in the front
    private int front;

    // this will be the index position for the element at the back of the line
    private int rear;

    // counter to maintain the number of items in our queue
    private int nItems;

    public QueueArrayImplementation(int size) {
        this.maxSize = size;
        queueArray = new long[size];
        front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array considered as the last item
        nItems = 0; // since there are no elements in the array yet
    }

    public void insert(long value) {
        
        if(rear == maxSize - 1) {
            rear = -1;
        }
        
        rear++;
        // Why rear was initialized at -1
        // Since the insertion happens at rear
        // Reason #1
        // Array index position starts at 0.
        // Hence it is necessary that first array element should be inserted at
        // index position 0
        queueArray[rear] = value;
        nItems++;
    }

    // Remove will always remove from the front
    // since we are standing at the front of the line
    // hence things will get served from the front
    public long remove() {

        long temp = this.queueArray[front];
        // Why front needs to be increased instead of being decreased needs to be understood
        front++;
        if(front == this.maxSize) {
            //If this is true then we have removed everything from the queue.
            //This can be initialized back to 0 so that we can reutilize the array again
            front = 0;
        }
        this.nItems--;
        return temp;
    }
    
    //this method will try to find out who is in the beginning of the line
    public long peekFront() {
        return this.queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (maxSize  == nItems);
    }

    public void display() {
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}

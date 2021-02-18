package prepbytes.queue.UsingArray;

/** QUEUE follows FIFO concept */
public class QueueUsingArray {
    int size; // size of prepbytes.array
    int[] array;

    // constructor
    public QueueUsingArray(int size) {
        this.size = size;
        array = new int[this.size]; // create prepbytes.array to store values of prepbytes.queue
    }

    int front = -1; // pointer to delete element from prepbytes.array
    int rear = -1; // pointer to insert element into prepbytes.array

    /** add an element to the rear of prepbytes.queue, using circular prepbytes.array concept */
    void enqueue(int data) {
        rear = (rear+1)% size;
        if (front==rear) {
            System.out.println("Queue is full");
            return;
        }
        else {
            array[rear] = data;
            if (front==-1)
                front=0;
        }
    }

    /** remove an element from front of prepbytes.queue and return the element*/
    int dequeue() {
        if (front==-1) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE; // or return -1
        }
        else {
            int temp = array[front];
            if (front==rear)
                front=rear=-1;
            front = (front+1)% size;
            return temp;
        }
    }

    /** prints the elements of the prepbytes.queue on a new line */
    void print() {
        if (front==rear)
            System.out.print("Queue is empty");
        else
            for (int i=front; i<=rear; i++){
                System.out.print(array[i]+", ");
            }
        System.out.println();
    }
}

package queue.UsingLinkedList;


import node.Node;

/** QUEUE follows FIFO concept */
public class QueueUsingLL {
    Node front = null; // remove element from front
    Node rear = null; // insert element to rear

    /** adds an element to the rear of queue */
    void enqueue(int data) {
        var newNode = new Node(data);
        if (rear == null) {
            // if empty LL
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }

    /** remove an element from front of queue and return the element */
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int data = front.data;
        front = front.next;
        if (front==null)
            rear = null;
        return data;
    }

    /** prints the elements of the queue on a new line */
    public void print(){
        Node tempNode = front;
        while(tempNode != null){
            System.out.print(tempNode.data + ", ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}



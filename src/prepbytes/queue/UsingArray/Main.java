package prepbytes.queue.UsingArray;

public class Main {
    public static void main(String[] args) {
        var queue = new QueueUsingArray(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(13);
        queue.enqueue(11);

        queue.print();

        int temp = queue.dequeue();
        System.out.println("Element dequeued: "+temp);
        queue.print();



    }
}

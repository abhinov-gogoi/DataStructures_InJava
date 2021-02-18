package prepbytes.stack.StackArray;

public class Main {
    public static void main(String[] args) {

        var stackArray = new StackUsingArray();

        // insert elements into the prepbytes.stack
        stackArray.push(50);
        stackArray.push(4);
        stackArray.push(60);
        stackArray.push(8);
        stackArray.push(234);
        stackArray.push(76);
        stackArray.push(61);
        stackArray.push(85);

        // remove elements from last - LIFO
        stackArray.pop();
        stackArray.pop();
        int popped = stackArray.pop();
        System.out.println("Last Popped element: "+popped);

        // print the prepbytes.stack
        stackArray.print();
    }
}

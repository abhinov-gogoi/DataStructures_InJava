package stack.StackLinkedList;

public class Main {
    public static void main(String[] args) {
        StacksUsingLinkedList stackLL = new StacksUsingLinkedList();
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(23);
        stackLL.push(50);
        stackLL.push(4);
        stackLL.push(60);
        stackLL.push(8);
        stackLL.push(234);
        stackLL.push(76);
        stackLL.push(61);
        stackLL.push(85);

        int poppedElem = stackLL.pop();
        System.out.println("Element popped = "+poppedElem);
    }
}

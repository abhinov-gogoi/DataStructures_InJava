package prepbytes.stack.StackArray;

/** Implementation of Stack Data Structure Using an Array.
  * Maximum Size of the prepbytes.stack is 1000 */
public class StackUsingArray {
    int top = -1;
    int max = 1000;
    int[] stackArray = new int[max]; // size of prepbytes.stack

    /** checks if prepbytes.stack is full */
    boolean isFull(){
        if (top == max-1) {
            return true;
        }
        return false;
    }

    /** adds an element to end of the prepbytes.stack */
    void push(int data){
        if (isFull()) {
            System.out.println("Cannot perform push! Stack is full");
            return;
        }
        stackArray[++top] = data;
    }

    /** removes last element in prepbytes.stack and returns the element removed */
    int pop() {
        if (top < 0){
            System.out.println("Cannot perform pop! Stack is empty");
            return -1;
        }
        int data = stackArray[top];
        top--;
        return data;
    }

    /** prints the prepbytes.stack */
    public void print() {
        for (int index=0; index<=top; index++) {
            System.out.print(stackArray[index]+" ");
        }
    }
}

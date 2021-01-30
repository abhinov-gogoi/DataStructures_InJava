package stack.StackLinkedList;

import node.Node;

/**Implements Stack Data Structure using a Singly Linked List. Size of Stack is determined by stack memory */
public class StacksUsingLinkedList {

    Node top;  // last element

    public void push(int x) {
        Node temp = new Node(x);

        if (temp == null) {
            System.out.print("\nStack Overflow");
            return;
        }

        temp.data = x;

        temp.next = top;

        top = temp;
    }

    public boolean isEmpty()  {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int popped_element = top.data;
            top = (top).next;
            return popped_element;
        }
        else {
            System.out.print("Stack is empty. Return ");
            return -1;
        }


    }

    public void display()
    {
        if (top == null) {
            System.out.println("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}




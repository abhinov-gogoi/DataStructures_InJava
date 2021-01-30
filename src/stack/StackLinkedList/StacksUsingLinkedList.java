package stack.StackLinkedList;

import node.Node;

/** Implements Stack Data Structure using a Singly Linked List. Size of Stack is determined by stack memory */
public class StacksUsingLinkedList {

    Node head = null;

    /** adds an element to end of the stack */
    void push(int data){
        var aNewNode = new Node(data);
        if(head==null)
            head = aNewNode;
        aNewNode.next = head;
        head = aNewNode;
    }

    /** removes the last element from the stack and returns it*/
    int pop(){
        if (head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }
}




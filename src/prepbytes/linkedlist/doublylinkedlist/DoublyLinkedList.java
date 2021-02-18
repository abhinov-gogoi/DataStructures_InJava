package prepbytes.linkedlist.doublylinkedlist;

import prepbytes.node.DLL_Node;

public class DoublyLinkedList {

    public DLL_Node head = null;

    void insertAtBeg(int data){
        DLL_Node newNode = new DLL_Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data){
        var aNewNode = new DLL_Node(data);
        DLL_Node tempNode = head;
        if (head == null)
            head = aNewNode;
        else{
            while(tempNode.next != null)
                tempNode = tempNode.next;
            tempNode.next = aNewNode;
            aNewNode.prev = tempNode;
        }
    }

    public void insertAfter(int num, int data){

        var newNode = new DLL_Node(data);
        if (head==null) {
            head = newNode;
        }
        else{
            DLL_Node tempNode = head;
            while(tempNode.data != num){
                tempNode = tempNode.next;
            }

            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            if (newNode.next != null)
                newNode.next.prev = newNode;
        }
    }

    public void delete(int num){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        DLL_Node delNode= head;
        while (delNode != null && delNode.data != num){
          delNode = delNode.next;
        }

        if (delNode == head){
            head = head.next;
            head.prev = null;
            return;
        }
        delNode.prev.next = delNode.next;
        if (delNode.next != null)
            delNode.next.prev = delNode.prev;
    }

    public void printList(){
        DLL_Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data+", ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }

}



package linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    Node head = null;

    void insertAtBeg(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data){
        var aNewNode = new Node(data);
        Node tempNode = head;
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

        var newNode = new Node(data);
        if (head==null) {
            head = newNode;
        }
        else{
            Node tempNode = head;
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

        Node delNode= head;
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
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data+", ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }

}



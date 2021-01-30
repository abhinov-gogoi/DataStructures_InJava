package linkedlist.singlylinkedlist;

public class LinkedList {
    Node head = null;

    public void insertAtBeginning(int data){
        Node aNewNode = new Node(data);
        aNewNode.next = head;
        head = aNewNode;
    }

    public void insertAtEnd(int data){
        Node aNewNode = new Node(data);
        if(head == null)
            head = aNewNode;
        else {
            Node lastNode = head;
            while (lastNode.next != null)
                lastNode = lastNode.next; // make lastNode point to last Node
            lastNode.next = aNewNode;
        }
    }

    public void insertAfter(int num, int data){
        Node tempNode = head;
        while( tempNode != null && tempNode.data != num)
            tempNode = tempNode.next;

        Node newNode = new Node(data);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    public void delete(int num){
        Node currentNode = head; // tempNode
        Node prevNode = null;

        while ( currentNode != null && currentNode.data != num) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode == head){
            if (head == null){
                System.out.println("List is Empty");
            }
            else
                head = head.next;
        }
        else
            prevNode.next = currentNode.next;
    }

    public boolean contains(int data) {
        Node temp = head;
        while (temp != null){
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void printList(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + ", ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }

    /* Function to print middle of linked list */
    void printMiddleElement(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is: " +slow_ptr.data + "\n");
        }
    }
}

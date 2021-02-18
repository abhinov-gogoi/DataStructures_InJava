package prepbytes.linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeg(4);
        dll.insertAtBeg(5);
        dll.printList();
        dll.insertAtEnd(10);
        dll.printList();
        dll.insertAfter(10, 9);
        dll.printList();
        dll.delete(5);
        dll.printList();
    }
}

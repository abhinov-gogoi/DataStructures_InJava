package linkedlist.singlylinkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList<E> list = new LinkedList<E>();
        list.insertAtBeginning(1);
        list.insertAtEnd(10);
        list.insertAfter(1, 2);
        list.insertAfter(2, 3);
        list.printList();  // 1, 2, 3, 10,
        list.delete(1);
        list.printList();  // 2, 3, 10,

    }
}

package node;

public class Pointers {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(12);
        Node node3 = new Node(17);

        // printing data of the node objects
//        System.out.println(node1.data);
//        System.out.println(node2.data);
//        System.out.println(node3.data);

        // pointing to the next nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        // printing data of the nodes
        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
    }
}

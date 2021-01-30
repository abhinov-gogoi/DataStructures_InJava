package node;

/**A node is a basic unit of a data structure, such as a linked list or tree data structure. Nodes contain data and also may link to other nodes. Links between nodes are often implemented by pointers, such as next (here), that points to the next Node object */
public class Node {
    public int data;
    public Node next;

    // constructor
    public Node(int data){
        this.data = data;
    }
}


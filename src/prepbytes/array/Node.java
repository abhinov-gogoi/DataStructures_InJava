package prepbytes.array;

/**A prepbytes.node is a basic unit of a data structure, such as a linked list or tree data structure. Nodes contain data and also may link to other nodes. Links between nodes are often implemented by pointers */
public class Node {
    public int data;
    public prepbytes.node.Node next;

    // constructor
    public Node(int data){
        this.data = data;
    }
}

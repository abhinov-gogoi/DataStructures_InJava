package node;

/**A node is a basic unit of a data structure, such as a linked list or tree data structure. Nodes contain data and also may link to other nodes. Links between nodes are often implemented by pointers, such as next (here), that points to the next Node object and prev that points to the previous Node object*/
public class DLL_Node {
    public int data;
    public DLL_Node next;
    public DLL_Node prev;

    // constructor
    public DLL_Node(int data) {
        this.data = data;
    }
}
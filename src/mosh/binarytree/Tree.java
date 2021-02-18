package mosh.binarytree;

public class Tree {

    // inner class Node because its not used anywhere else
    private class Node {
        int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.value = data;
        }

        @Override
        public String toString() {
            return "Node="+value;
        }
    }

    public Node root;

    // constructor
    public void insert(int value) {
        var node = new Node(value);

        if(root==null){
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if(value<current.value){
                if (current.leftChild==null){
                   current.leftChild =node;
                   break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }

        }
    }


}

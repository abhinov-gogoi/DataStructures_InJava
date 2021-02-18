package prepbytes.array;


public class ArrayOfNodes {
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(17);

        Node[] arr = new Node[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;


        System.out.println(arr);
        System.out.println(java.util.Arrays.toString(arr));

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0].data);
        System.out.println(arr[1].data);
        System.out.println(arr[2].data);

        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());
    }


    /*
        In the Java programming language, arrays are objects
        So, the prepbytes.array itself is a reference type.
        The values of that prepbytes.array are value or reference types
        as determined by the prepbytes.array data type
     */
}

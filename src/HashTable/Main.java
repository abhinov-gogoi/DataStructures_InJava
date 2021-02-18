package HashTable;

public class Main {
    public static void main(String[] args) throws EntryNotFoundException {
        HashTable table = new HashTable();
        table.put(6, "Abc");
        table.put(8, "UFY");
        table.put(11, "HELLO");
        table.put(6, "AAA");
        table.remove(110);
    }
}

package mosh.HashTable;

public class EntryNotFoundException extends Exception {

    public EntryNotFoundException(String message) {
        super(message);
    }

    public EntryNotFoundException() {
        super("Entry not found for the specified key");
    }
}

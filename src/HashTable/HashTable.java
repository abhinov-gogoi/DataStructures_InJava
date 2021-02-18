package HashTable;


import java.util.LinkedList;

/**
     HashTable will be implemented using an array of LinkedList
     those LinkedLists(or buckets) will contain objects of type Entry.
 */

public class HashTable {
    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key);

        /**
             initialise the array cell
             (don't replace entries[index] with bucket here)
         */
        if (entries[index]==null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];

        /**
            if the unique is assigned a different value later
            don't add to the last, rather update the unique key with the new value
         */
        for(var entry:bucket) {
            if(entry.key==key) {
                entry.value = value;
            return;
            }
        }
        bucket.addLast(new Entry(key, value));
    }

    public String get(int key){
        int index = hash(key);
        var bucket = entries[index];
        if(bucket != null){
            for(var entry:bucket){
                if(entry.key==key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) throws EntryNotFoundException {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket==null)
            throw new EntryNotFoundException();
        for(var entry:bucket) {
            if (entry.key==key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new EntryNotFoundException();
    }

    /**
        Hash function takes in the key and returns the index of the array
        at which data will be put added to the LinkedList
     */

    private int hash(int key) {
        return Math.abs(key % entries.length);
    }



}

package prepbytes.hashing;

/**
    HASH TABLE -
    Hash table or Hash map is a Data Structure
    that stores the keys and their associated values
    It uses a hash function to store the keys and associated values.
    Each position of a hash table is called a slot or bucket.

    HASH FUNCTION -
    Used to transform the key into the slot index

    Ideally, the hash function should map each possible key to a unique
    slot/index, but it is difficult to achieve in practice.
    As COLLISIONS are bound to occur.

    Example-
    consider the prepbytes.array int[] arr = {11, 145, 156 , 357, 38, 29};
    Now to store this is a freq prepbytes.array, we need prepbytes.array of size 357 (largest elem in the prepbytes.array)
    while no of elements is only 6.
    So we use a hash function.

    Here we use a mod hash function,
    but the last digit of two elements in the prepbytes.array could be same
    and in that case w get COLLISION
    as both elements will be mapped to same key.
    There will be data loss, so its not an ideal hash function.

 */

public class ModHashFunction {

    public static void main(String[] args) {
        int[] arr = {11, 145, 156 , 357, 38, 29};
        int[] hashTable = new int[10];

        for (int i=0; i<hashTable.length; i++)
            hashTable[i] = -1; // initialise all values of mosh.HashTable with -1;

        for (int i=0; i<arr.length; i++){
            hashTable[arr[i]%10] = arr[i]; // populate the mosh.HashTable -  using a mod hash function
        }

        for (int i=0; i<hashTable.length; i++){
            if (hashTable[i] != -1)
                System.out.println("Element present at slot index "+i+" is "+hashTable[i]);
        }
    }
}



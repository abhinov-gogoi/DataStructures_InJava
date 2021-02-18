package prepbytes.hashing;

public class ModPrimeNoHashFunction {

    public static void main(String[] args) {
        int[] arr = {11, 141, 156 , 356, 36, 29};
        int[] hashTable = new int[10];

        for (int i=0; i<hashTable.length; i++)
            hashTable[i] = -1; // initialise all values of mosh.HashTable with -1;

        for (int i=0; i<arr.length; i++){
            // populate the mosh.HashTable -  using a mod hash function of prime number 11
            hashTable[arr[i]%11] = arr[i];
        }

        for (int i=0; i<hashTable.length; i++){
            if (hashTable[i] != -1)
                System.out.println("Element present at slot index "+i+" is "+hashTable[i]);
        }
    }
}

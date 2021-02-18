package prepbytes.hashing;

/*
    This is like a direct address table, see direct address table
 */

public class FreqArray {
    public static void main(String[] args) {
        // To calc how many times an elem occurs in an prepbytes.array
        int[] arr = {0,1,2,1,4,6,4,7,1,8,9,2,5,6,1,9,9,9,4,1,6,9,2,4,5,1,2,7,2};

        // create a freq prepbytes.array with size equal to max element+1 of arr
        int[] freqArr = new int[9+1];
        for (int i=0; i<arr.length; i++){
            freqArr[arr[i]]+=1; // increase count in the freq prepbytes.array at that index
        }

        for (int i=0; i<freqArr.length; i++){
            System.out.println(i+" occours "+ freqArr[i] + " times");
        }
    }

}

package Arrays;

public class numberThatAppearsOnce {
    //We are given an array where every number is present 2 times except one. We need to find out which number is that.
    //i.e. arr = [1,1,2,3,3,4,4] Ans: 2

    //Brute Force ==> We iterate through every element and count the instances, return when count = 1.
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    static int brute(int[] arr){
        int n = arr.length;

        for (int i : arr) {
            int count = 0;
            for (int k : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count == 1) return i;
        }
        return -1;
    }

    //Better Approach ==> We use hashing, store the frequency and return where count = 1.
    //Time Complexity: O(n+n+n)
    //Space Complexity: O(max)
    static int better(int[] arr){
        int n = arr.length;
        int max = 0;

        //Calculate max digit
        for (int i : arr) {
            max = Math.max(max, i);
        }
        int[] hash = new int[max+1];
        //Calculate frequencies
        for (int j : arr) {
            hash[j]++;
        }
        //Check where frequency = 1
        for (int i = 0; i < max+1; i++) {
            if (hash[i] == 1){
                return i;
            }
        }

        return -1;
    }

    //Optimal Approach ==> We use XOR operation and return.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static int optimal(int[] arr){
        int xorr = 0;
        int n = arr.length;

        for (int j : arr) {
            xorr ^= j;
        }

        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}

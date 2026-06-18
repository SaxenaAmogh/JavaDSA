package Arrays;

public class missingNumber {
    //Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. Find the missing element in the array.
    //i.e. arr = [8,4,5,2,3,7,1] ==> n=8; 6 is missing

    //Brute Force ==> We use loops to iterate through all and check each digit separately. If not found, return it.
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    static int brute(int[] arr){
        int n = arr.length + 1;

        for (int i = 1; i<n; i++){
            boolean found = false;
            for (int j = 0; j<n-1; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found){
                return i;
            }
        }
        return -1;
    }

    //Better Approach ==> We use Hashing! Simply store frequency of all n digits and whichever has 0 frequency, return it.
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    static int better(int[] arr){
        int n = arr.length + 1;
        int[] hash = new int[n+1];

        for (int i = 0; i<n-1; i++){
            hash[arr[i]]++;
        }
        for (int i = 1; i < n; i++) {
            if (hash[i] == 0){
                return i;
            }
        }

        return -1;
    }

    //Optimal Approach ==> We use Math! Calculate sum of n natural numbers then subtract sum of digits in array, the difference is the answer.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static int optimal(int[] arr){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;

        int digitSum = 0;
        for (int i = 0; i < n-1; i++) {
            digitSum += arr[i];
        }

        return sum - digitSum;
    }
    //Op2 - Using XOR, but not feeling like doing it... Same complexities btw :|

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};
        System.out.print("Answer using Brute Force: ");
        System.out.println(brute(arr));
        System.out.print("Answer using a Better Approach: ");
        System.out.println(better(arr));
        System.out.print("Answer using the Optimal Approach: ");
        System.out.println(optimal(arr));
    }
}

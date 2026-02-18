package Arrays;

import java.util.Arrays;

public class reverseArray {
    //We are given an array and need to reverse it.
    //i.e. a = [1,2,3,4,5,6,7] ---> a = [7,6,5,4,3,2,1]

    //Brute Force ==> We take an empty array, start putting elements of arr in reverse order. NOT in-place solution.
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    static int[] brute(int[] arr){
        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i<n; i++){
            reversed[i] = arr[n-i-1];
        }

        return reversed;
    }

    //Optimal Approach ==> We take elements from start and end, swap them. Then iterate in both directions. THIS IS IN-PLACE!!
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static void optimal(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Original Array = ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Using BRUTE FORCE: ");
        System.out.println(Arrays.toString(brute(arr)));
        optimal(arr);
        System.out.print("Using OPTIMAL APPROACH: ");
        System.out.println(Arrays.toString(arr));
    }
}

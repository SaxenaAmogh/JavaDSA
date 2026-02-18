package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZeroes {
    //We are given an array of integers and are tasked with moving all the zeroes to the end of the array while keeping rest or relative order of array the same.
    //i.e. if a = [1,2,0,3,0,0,6,7,2] --> a = [1,2,3,6,7,2,0,0,0]

    //Brute Force ==> We take the array, put non-zero elements in temp[]. Then put temp elements at array's start and replace remaining elements with 0.
    //Time Complexity: 0(2n)
    //Space Complexity: O(n)
    static void brute(int[] array){
        ArrayList<Integer> temp = new ArrayList<>();
        int n = array.length;

        for (int i: array){
            if (i != 0){
                temp.add(i);
            }
        }
        for(int i = 0; i<temp.size(); i++){
            array[i] = temp.get(i);
        }
        for (int i = temp.size(); i<n; i++){
            array[i] = 0;
        }
    }

    //Optimal Approach ==> We again apply the 2 Pointer Approach to this. One checks for pos of Zero, another finds non-zero elements, then just swapped.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static void optimal(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 3};
        System.out.print("Using BRUTE FORCE: ");
        brute(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Using OPTIMAL APPROACH: ");
        optimal(array);
        System.out.println(Arrays.toString(array));
    }
}

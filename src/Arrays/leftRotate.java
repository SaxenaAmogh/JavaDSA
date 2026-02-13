package Arrays;

import java.util.Arrays;

public class leftRotate {
    //We are given an array, and it is to be rotated to the left by one.
    //i.e. if a = [1,2,3,4,5] then a = [2,3,4,5,1]
    
    public static void main(String[] args) {
        //Optimal Approach ==> We simply use a temp variable and store the 0th element. Then traverse and shift each element to the left.
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        int[] array = {1,2,3,4,5};
        int n = array.length;
        int temp = array[0];
        for (int j = 1; j<n; j++){
            array[j-1] = array[j];
        }   
        array[n-1] = temp;
        System.out.println(Arrays.toString(array));
    }
}

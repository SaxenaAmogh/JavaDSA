package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    //A sorted array is given. We need to remove the duplicates from it "in-place" and return the number of unique elements.
    //Basically we need to change a sorted array, into such that starting elements are not duplicate, and rest array be whatever it may be.
    //Example - a = [1,1,2,2,2,3,3] ==> a = [1,2,3, _, _, _, _] and return 3

    //Brute Force --> We use the 'Set' data structure to store unique elements from the array. Then update the original array.
    //Time Complexity: O(NlogN + N)
    static int brute(int[] array){
        Set<Integer> set = new HashSet<>();
        int index=0;

        for (int j : array) {
            set.add(j);
        }
        for (int j :set){
            array[index] = j;
            index++;
        }

        return index;
    }

    //Optimal Approach --> We use the classic 'Two Pointer' approach. One pointer for traversing and another for checking with earlier elements.
    //Time Complexity: O(N)
    static int optimal(int[] array){
        int index = 0;
        int n = array.length;
        for (int j = 1; j < n; j++){
            if (array[j] != array[index]){
                array[index+1] = array[j];
                index++;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] array1 = {1,1,2,2,2,3,3};
        int[] array2 = {1,1,2,2,2,3,3};
        System.out.print("Using brute force/set: ");
        System.out.println(brute(array1));
        System.out.print("Updated Array1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Using optimal force/2Pointer: ");
        System.out.println(optimal(array2));
        System.out.print("Updated Array2: ");
        System.out.println(Arrays.toString(array2));
    }
}

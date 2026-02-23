package Arrays;

import java.util.ArrayList;

public class intersectionOfArrays {
    //We are given 2 sorted arrays, and we need to return the intersection of those.
    //i.e. if a1 = [1,2,2,3,3,4,5,6,8] and a2 = [2,3,3,5,6,6,7,7,7,7,8] --> union = [2,3,5,6,8]

    //Brute Force: We use nested for loops. One takes element from a1 other checks similar ones in a2, then add if not repeated.
    //Time Complexity: O(n1 x n2)
    //Space Complexity: O(n1 + n2) [worst case, only to store and return answer array]
    static ArrayList<Integer> brute(int[] a1, int[] a2){
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;

        for (int k : a1) {
            for (int i : a2) {
                if (k < i) break;
                else if (k == i) {
                    if (arr.isEmpty() || arr.get(index - 1) != k) {
                        arr.add(k);
                        index++;
                    }
                }
            }
        }
        return arr;
    }

    //Optimal Approach: We use 2 Pointer Approach. One takes element from a1, other finds duplicate in a2. Add if not repeated.
    //Time Complexity: O(n1 + n2)
    //Space Complexity: O(n1 + n2) [worst case, only to store and return answer array]
    static ArrayList<Integer> optimal(int[] a1, int[] a2){
        ArrayList<Integer> arr = new ArrayList<>();
        int j = 0, i = 0, index = 0;
        int n1 = a1.length, n2 = a2.length;

        while (i<n1 && j<n2){
            if (a1[i] < a2[j]){
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            }
            else{
                if (arr.isEmpty() || arr.get(index - 1) != a1[i]) {
                    arr.add(a1[i]);
                    index++;
                }
                i++;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6,8};
        int[] arr2 = {2,3,3,5,6,6,7,7,7,7,8};
        System.out.print("The Union of arrays by Brute Force is: ");
        System.out.println(brute(arr1,arr2));
        System.out.print("The Union of arrays by Optimal Approach is: ");
        System.out.println(optimal(arr1,arr2));
    }
}

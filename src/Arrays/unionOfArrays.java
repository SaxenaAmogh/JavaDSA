package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class unionOfArrays {
    //We are given 2 arrays which may or may not contain duplicates. We need to return union of those arrays.
    //i.e. if a1 = [1,1,2,3,4,5] and a2 = [2,3,4,4,5,6] --> union = [1,2,3,4,5,6]

    //Brute Force ==> We use a set data structure, which stores unique elements only. TreeSet is used to store the sorted order.
    //Time Complexity: O(n1 logn + n2 logn) + O(n1 + n2)
    //Space Complexity: O(n1+n2) + O(n1+n2)
    static ArrayList<Integer> brute(int[] a1, int[] a2){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : a1){
            set.add(i);
        }
        for (int j : a2){
            set.add(j);
        }
        return new ArrayList<>(set);
    }

    //Optimal Approach ==> We use the 2 Pointer approach. One pointer for one array, checks for duplication then adds in union.
    //Time Complexity: O(n1 + n2)
    //Space Complexity: O(n1 + n2)
    static ArrayList<Integer> optimal(int[] a1, int[] a2){
        ArrayList<Integer> union = new ArrayList<>();
        int n1 = a1.length, n2 = a2.length;
        int i = 0, j = 0, index = 0;

        while (i<n1 && j<n2){
            if (a1[i] <= a2[j]){
                if (union.isEmpty() || union.get(index-1)!=a1[i]){
                    union.add(a1[i]);
                    index++;
                }
                i++;
            }else if (a2[j] < a1[i]){
                if (union.isEmpty() || union.get(index-1)!=a2[j]){
                    union.add(a2[j]);
                    index++;
                }
                j++;
            }
        }
        while (i < n1){
            if (union.isEmpty() || union.get(index-1)!=a1[i]){
                union.add(a1[i]);
                index++;
            }
            i++;
        }
        while (j < n2){
            if (union.isEmpty() || union.get(index-1)!=a2[j]){
                union.add(a2[j]);
                index++;
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        System.out.print("The Union of arrays by Brute Force is: ");
        System.out.println(brute(arr1,arr2));
        System.out.print("The Union of arrays by Optimal Approach is: ");
        System.out.println(optimal(arr1,arr2));
    }
}
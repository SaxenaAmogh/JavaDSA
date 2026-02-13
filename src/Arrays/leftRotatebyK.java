package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leftRotatebyK {
    //We are given an array, and it is to be rotated to the left by k places.
    //i.e. if a = [1,2,3,4,5,6,7], k = 3 then a = [4,5,6,7,1,2,3]
    //IMP: net rotations to be done are k%n where n is length of array.

    //Brute Force ==> We just use a nested for loop and rotate the array k times using older method.
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    static void brute(int[] array, int k){
        int n = array.length;
        int rotations = (k % n);
        for (int i = 0; i<rotations; i++){
            int temp = array[0];
            for (int j = 0; j<n-1; j++){
                array[j] = array[j+1];
            }
            array[n-1] = temp;
        }
    }

    //Better Approach ==> We just use a nested for loop and rotate the array k times using older method.
    //Time Complexity: O(n+k)
    //Space Complexity: O(n)
    static void better(int[] array, int k){
        int n = array.length;
        int rotations = (k % n);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i<rotations; i++){
            temp.add(array[i]);
        }
        for (int i = 0; i<n-rotations; i++){
            array[i] = array[i+rotations];
        }
        for (int i = n-rotations; i<n; i++){
            array[i] = temp.get(i-(n-rotations));
        }
    }

    //Optimal Approach ==> Seeing a pattern, if we reverse the array 3 times, in a particular manner, we get the desired output!
    //i.e. a = [1,2,3,4,5,6,7] -> a = [4,3,2,1,5,6,7]then a = [4,3,2,1,7,6,5] and finally a = [5,6,7,1,2,3,4]
    //Time Complexity: O(2n)
    //Space Complexity: O(1)
    static void optimal(int[] array, int k){
        int n = array.length;
        int rotations = (k%n);

        reverse(array, 0, rotations-1);
        reverse(array, rotations, n-1);
        reverse(array, 0, n-1);
    }
    static void reverse(int[] array, int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};
        System.out.print("Enter the value of 'k': ");
        int k = sc.nextInt();
        System.out.print("Enter the number of choice - 1-Brute, 2-Better, 3-Optimal: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Using Brute Force: ");
                brute(array,k);
                break;
            case 2:
                System.out.print("Using Better Approach: ");
                better(array,k);
                break;
            case 3:
                System.out.print("Using Optimal Approach: ");
                optimal(array,k);
                break;
        }
        System.out.println(Arrays.toString(array));
    }
}

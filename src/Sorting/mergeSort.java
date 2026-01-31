package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
    public static void sort(ArrayList<Integer> arr, int low, int high){
        if (low >= high) return;
        int mid = (low + high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(ArrayList<Integer> arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left<=mid && right<=high){
            if (arr.get(left) <= arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
                temp.add(arr.get(right));
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr.get(left));
            left++;
        }
        while (right<=high){
            temp.add(arr.get(right));
            right++;
        }
        for (int i=low; i<=high; i++){
            arr.set(i, temp.get(i-low));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i<5; i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        sort(arr, 0, 4);
        System.out.println(arr);
    }
}

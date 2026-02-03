package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class allSorts {
    //Selection Sort Implementation
    static void selection(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i<=n-2; i++){
            int min = i;
            for (int j = i; j<=n-1; j++){
                if (arr.get(j) < arr.get(min)){
                    min = j;
                }
            }
            int temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);
        }
    }

    //Bubble Sort Implementation
    static void bubble(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = n-1; i >= 1; i--){
            int swapCount = 0;
            for (int j = 0; j <= i-1; j++){
                if (arr.get(j+1) < arr.get(j)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    swapCount++;
                }
            }
            if (swapCount==0){
                return;
            }
        }
    }

    //Insertion Sort Implementation
    static void insertion(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 1; i <= n-1; i++){
            int j = i;
            while (j > 0 && arr.get(j-1) > arr.get(j)){
                int temp = arr.get(j);
                arr.set(j, arr.get(j-1));
                arr.set(j-1, temp);
                j--;
            }
        }
    }

    //Merge Sort Implementation
    static void merge(ArrayList<Integer> arr, int low, int high){
        if (low >= high) return;
        int mid = (low + high)/2;

        merge(arr, low, mid);
        merge(arr, mid+1, high);
        mergeArray(arr, low, mid, high);
    }

    static void mergeArray(ArrayList<Integer> arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left<=mid && right<=high){
            if (arr.get(left) <= arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else {
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
        for (int i = low; i<=high; i++){
            arr.set(i, temp.get(i-low));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int len = sc.nextInt();
        System.out.println("Now, enter the array:");
        for (int i = 0; i < len; i++){
            int num = sc.nextInt();
            array.add(num);
        }
        System.out.print("Enter the number of choice - 1-S, 2-B, 3-I, 4-M: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Sorting done by Selection Sort: ");
                selection(array);
                break;
            case 2:
                System.out.print("Sorting done by Bubble Sort: ");
                bubble(array);
                break;
            case 3:
                System.out.print("Sorting done by Insertion Sort: ");
                insertion(array);
                break;
            case 4:
                System.out.print("Sorting done by Merge Sort: ");
                merge(array, 0, len-1);
                break;
        }
        System.out.println(array);
    }
}
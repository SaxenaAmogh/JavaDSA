package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,-8,1,-2};
        int len = arr.length;
        for (int i = 0; i<len-1; i++){
            int min = i;
            for (int j = i; j<len; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}

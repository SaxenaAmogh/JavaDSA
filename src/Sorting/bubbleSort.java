package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {13,29,19,42,9};
        int len = array.length;

        for (int i = len - 1; i>=1; i--){
            int swapCount = 0;
            for (int j = 0; j<=i-1; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0){
                break;
            }
        }
        for (int k : array) {
            System.out.println(k);
        }
    }
}

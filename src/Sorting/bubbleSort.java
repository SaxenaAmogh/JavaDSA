package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {13,29,19,42,9};
        int len = array.length;

        for (int i = len - 1; i>=1; i--){
            for (int j = 0; j<=i-1; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int k : array) {
            System.out.println(k);
        }
    }
}

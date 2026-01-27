package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {13,29,19,42,9};
        int len = array.length;

        for (int i = 1; i <= len-1; i++){
            //FOR loop implementation
//            for (int j = i; j>0; j--){
//                if (array[j-1] > array[j]){
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
//                }else {
//                    break;
//                }
//            }
            //WHILE loop implementation
            int j = i;
            while (j>0 && array[j-1]>array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        for (int k : array) {
            System.out.println(k);
        }
    }
}

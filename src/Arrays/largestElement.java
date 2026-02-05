package Arrays;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {13,29,19,42,9};
        int largest = arr[0];

        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print("The largest element in the array is: ");
        System.out.print(largest);
    }
}

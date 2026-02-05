package Arrays;

public class largestElement {
    public static void main(String[] args) {
        //Brute Force --> Use merge/quick sort then return the (n-1)th element of the array
        //Time Complexity: 0(NlogN)

        //NO Better Approach

        //Optimal Approach --> Traverse through the array, use a temp variable to check
        //Time Complexity: 0(N)
        
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

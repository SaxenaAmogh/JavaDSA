package Arrays;

public class maxConsecutiveOnes {
    // We are given an array with only 0's and 1's. We need to find out number of maximum consecutive ones.
    //i.e. arr = [1,1,0,1,1,1,0,0,1] ==> Answer = 3

    //Optimal Solution ==> Very straightforward solution so directly using most optimal solution. Just use 2 variables and store values.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static int optimal(int[] arr){
        int max = 0;
        int count = 0;

        for (int j : arr) {
            if (j == 1) {
                count++;
            }else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1};
        System.out.print("Answer using the Optimal Approach: ");
        System.out.println(optimal(arr));
    }
}

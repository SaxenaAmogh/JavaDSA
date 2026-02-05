package Arrays;

public class secLargest {
    //Brute Force --> Use merge/quick sort. Then run a loop to find second-smallest as (n-2)th may or may not be second-smallest.
    //Time Complexity: 0(NlogN + N)
    static int brute(int[] arr){
        //We are taking a sorted array as input to mimic sorting algorithm
        int n = arr.length;
        int largest = arr[n-1];
        int slargest = -1;

        for (int i = n-2; i >= 0; i--){
            if (arr[i] != largest){
                slargest = arr[i];
                return slargest;
            }
        }
        return slargest;
    }

    //Better Approach --> We use 2 loops - one to find LARGEST and another to fins 2nd LARGEST.
    //Time Complexity: 0(2N)
    static int better(int[] arr){
        int largest = arr[0];
        int slargest = -1;
        for (int k : arr) {
            if (k > largest) {
                largest = k;
            }
        }
        for (int j : arr) {
            if (j != largest && j > slargest) {
                slargest = j;
            }
        }
        return slargest;
    }

    //Optimal Approach -->  We take 2 variables like earlier. Check for largest, if found we give older value to 2nd variable.
    //Time Complexity: 0(N)
    static int optimal(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
        for (int i = 1; i < n; i++){
            if (arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,7,7,5};
        System.out.print("Brute Force-> The 2nd Largest element is = ");
        System.out.println(brute(new int[]{1,2,4,5,7,7}));
        System.out.print("Better Approach-> The 2nd Largest element is = ");
        System.out.println(better(array));
        System.out.print("OPTIMAL APPROACH-> The 2nd Largest element is = ");
        System.out.println(optimal(array));
    }
}

package Arrays;

public class longestSubarray {
    //Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

    static int solution(int[] nums, int k){
        int i = 0;
        int j = 0;
        int len = 0;
        int sum = nums[0];
        int n = nums.length;

        while(j < n){
            if(i == j) sum = nums[i];
            else sum += nums[j];

            if (sum == k){
                len = Math.max(len, j-i+1);
                i++;
                j = i;
            }
            else if(sum > k){
                i++;
                j = i;
            }
            else j++;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,5,2};
        int[] arr2 = {1, 4, -1};

        System.out.println(solution(arr,3));
        System.out.println(solution(arr2,1));
        System.out.println(solution(arr2,3));
        //PS - This solution is optimal but misses out on certain edge cases with negative numbers. Will fix later...
    }
}
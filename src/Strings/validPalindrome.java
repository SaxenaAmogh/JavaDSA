package Strings;

public class validPalindrome {
    //We are given a string, and we have to check whether it is a palindrome or not.
    //i.e. str = "madam" --> Yes, a palindrome! str = "java" --> Not a palindrome.

    //Brute Force ==> We just make a whole new string, but reversed. Then compare both.
    //Time Complexity: O(n^2)
    //Space Complexity: O(n)
    static boolean brute(String str){
        String reversed = "";

        for (int i = str.length()-1; i>=0; i--){
            reversed += (str.charAt(i));
        }

        return str.equals(reversed);
    }

    //Optimal Approach ==> We use the array reversal technique. Just check first with last, then traverse and check again.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static boolean optimal(String str){
//        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.print("Using BRUTE FORCE: ");
        System.out.println(brute(str));
        System.out.print("Using OPTIMAL APPROACH: ");
        System.out.println(optimal(str));
    }
}

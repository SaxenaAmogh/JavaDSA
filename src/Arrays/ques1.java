package Arrays;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the array one by one: ");
        for (int i = 0; i<len; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find: ");
        int x = sc.nextInt();
        for (int i = 0; i<len; i++){
            if (array[i] == x){
                System.out.print("Number found at index: ");
                System.out.println(i);
            }
        }
    }
}

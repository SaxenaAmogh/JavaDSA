package Arrays;

import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
//        int[] marks = new int[4];
//        marks[0] = 1;

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] marks = new int[len];
        marks[0] = 21;
        System.out.println(marks[0]);
    }

}
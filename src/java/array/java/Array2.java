package java.array.java;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            System.out.println("the array is:" + c[i]);
            c[i] = scanner.nextInt();

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("the array is in for loop" + c[i]);

        }

        // for each loop
        for (int n : c) {
            System.out.println("the for each loop:" + n);
        }



    }
}

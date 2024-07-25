package com.exception.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner =new Scanner(System.in);
        try {


            System.out.println("enter first value:");
            int a = scanner.nextInt();
            System.out.println("enter second value:");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("the result:" + c);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.err.println(" it is should not divisble by zero");
        }catch (Exception a){
            a.printStackTrace();
            System.out.println(a.getMessage());
            System.err.println("here we give a string to the int value ");
        }
        System.out.println("end of the program");



    }
}

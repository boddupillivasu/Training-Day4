package com.exception.java;

import java.util.Scanner;

public class ValidAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        try {


            if (age < 18) {
                throw new InvalidAgeException("you are eligible for cast ur vote");


            } else {
                System.out.println("not eligible for vote");
            }
        }catch (InvalidAgeException e){
            System.err.println(e.getMessage());
        }
    }
}

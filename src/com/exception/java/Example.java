package com.exception.java;

public class Example {
    public static void main(String[] args) {

            System.out.println("this is a first stament");

            // to handle the exception write exception code in try block
        try {


            int a;
            a = 100 / 0;
            System.out.println("the answer:" + a);
        }catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println("the message is:"+e.getMessage());
            // user defind exception
            System.err.println("this is divisible by zero");
        }
        System.out.println("this is second statement");

    }
}

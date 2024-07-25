package com.exception.java;

public class Exception4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("statement 1");



//        try {
//
//
//            Thread.sleep(100);
//        }catch (InterruptedException  e){
//            System.out.println(e.getMessage());
//            System.err.println("this is never get thread exception");
//        }
//
//        System.out.println("statement 2");

        Thread.sleep(1000);
        System.out.println("statement 2");
    }
}

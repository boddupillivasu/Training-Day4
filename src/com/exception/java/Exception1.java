package com.exception.java;

public class Exception1 {
    public static void main(String[] args) {
        String name = null;
        System.out.println("statement 1");
        try {


            System.out.println(name.length());
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println(" the String is  null");

        }
        System.out.println("statement 2");
    }
}

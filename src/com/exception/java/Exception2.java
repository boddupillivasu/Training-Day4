package com.exception.java;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("the array  is");
        int a[] = {23,32,3,233};
        try {

/*
i=0 ,o<=5 value:23
i=1 ,1<=5 value:32
i=2 ,2<=5 value:3
i=3 ,3<=5 value:233
i=4 ,4<=5 value: exeception

 */
            for (int i = 0; i <= a.length; i++)
                System.out.println(a[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.err.println("this is array bound exception");
        }
        System.out.println("statement 2");
    }

}

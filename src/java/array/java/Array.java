package java.array.java;

public class Array {
    public static void main(String[] args) {
        int [ ] array = {10,23,32,33,33};
        // it gives hash code
        System.out.println(array);
        System.out.println(array.length);

        System.out.println("-- for loop --");
        for (int i =0 ; i< array.length;  i++){
            System.out.println("the array is"+array[i]);
            
        }

        // for each loop
        for (int n: array){
            System.out.println("the for each loop:"+n);
        }
    }


}

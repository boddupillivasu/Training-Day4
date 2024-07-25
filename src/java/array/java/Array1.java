package java.array.java;

public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 22;
        a[1] = 222;
        a[2] = 23;
        a[3] = 223;
        a[4] = 24;
        System.out.println(a);
        System.out.println(a.length);
        System.out.println("-- for loop --");
        for (int i = 0; i < a.length; i++) {
            System.out.println("the array is" + a[i]);

        }

        // for each loop
        for (int n : a) {
            System.out.println("the for each loop:" + n);
        }
    }

}
    


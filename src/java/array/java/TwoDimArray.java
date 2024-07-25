package java.array.java;

public class TwoDimArray {
    public static void main(String[] args) {
        //int a[][] = new int[5][5];
        int a[][]  = {{1, 2, 2}, {2, 4, 3}};
        for (int i = 0; i < 2; i++) {//rows
            for (int j = 0; j < 3; j++) {//colums
                System.out.print(a[i][j]+"");
            }
            System.out.println(" ");
        }

    }
}

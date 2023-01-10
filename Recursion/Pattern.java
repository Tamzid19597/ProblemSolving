package Recursion;

public class Pattern {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n){
        printTriangleHelper(n,n);
        printTriangleHelper2(n,n);
    }
    static void printTriangleHelper(int row,int column){
        if (row<=0) return;
        if (column>0){
            System.out.print("*");
            printTriangleHelper(row,column-1);

        }
        else {
            System.out.println();
            printTriangleHelper(row-1,row-1);
        }

    }
    static void printTriangleHelper2(int row,int column){
        if (row<=0) return;
        if (column>0){
            printTriangleHelper2(row,column-1);
            System.out.print("*");

        }
        else {
            printTriangleHelper2(row-1,row-1);
            System.out.println();
        }

    }
}

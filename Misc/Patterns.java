package Misc;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("pattern1: ");
        pattern1(5);
        System.out.println();
        System.out.println("pattern2: ");
        pattern2(5);
        System.out.println("pattern3: ");
        pattern3(5);
        System.out.println();
        System.out.println("pattern4: ");
        pattern4(5);
        System.out.println();
        System.out.println("pattern6: ");
        pattern6(5);

    }
    static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n-1;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i=1;i<=n;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

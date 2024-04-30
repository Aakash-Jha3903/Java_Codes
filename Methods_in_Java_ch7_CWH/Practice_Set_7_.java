package Methods_in_Java_ch7_CWH;
import java.util.Scanner;

public class Practice_Set_7_ {
    static void Table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n", i, n, i * n);
        }
    }

    static void Pattern2(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int natural(int n) {
        if (n == 1)
            return 1;
        else {
            return n + natural(n - 1);
        }
    }

    static void pattern3(int rows) {
        // for(int i=0; i<rows; i++)
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int fibo_nth_terms(int n) {
        // Display the nth terms of Fibonacci series
        // 0,1,1,2,3,5,8,13,21,34
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        // if(n==1 || n==2) return n-1; // Note the short notation ****************
        else {
            return fibo_nth_terms(n - 1) + fibo_nth_terms(n - 2);
        }

    }

    static void pattern2_rec(int n) {
        if (n > 0) {
            pattern2_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // pattern1_rec(3)
        // pattern1_rec(2) + 3 times star and new line
        // pattern1_rec(1) + 2 times star and new line . 3 times star and new Line
        // pattern1_rec(0) + 1 times star and new link + 2 times star and new line + 3 times star and new line
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Question number : ");
        int q = sc.nextInt();
        switch (q) {
            case 1:
                System.out.print("Enter a number : ");
                int num = sc.nextInt();
                Table(num);

            case 2:
                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();
                Pattern2(rows);

            case 3:
                System.out.print("Enter the Natural number : ");
                int n = sc.nextInt();
                int sum = 0;
                sum += natural(n);
                System.out.print("Sum is : " + sum);

            case 4:
                System.out.print("Enter the number of rows :");
                int rows3 = sc.nextInt();
                pattern3(rows3);

            case 5:
                // Display the nth terms of Fibonacci series .......
                // 0,1,1,2,3,5,8,13,21,34
                System.out.print("Enter the number of terms for fibo :");
                int f = sc.nextInt();
                int s = fibo_nth_terms(f);
                System.out.print("fibo :" + s);

            case 6:
                System.out.print("Enter the number of rows : ");
                int rows_rec = sc.nextInt();
                pattern2_rec(rows_rec);
        }
    }
}

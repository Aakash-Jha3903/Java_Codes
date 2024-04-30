import java.util.Scanner;

class Fibo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms : ");

        int n = sc.nextInt();
        int i, a = 0, b = 1, c;
        if (n <= 0) 
        {
            System.out.println("Enter an integer greater than zero : ");
        } 
        else 
        {
            if (n >= 1) {
                System.out.println(0);
            }
            if (n >= 2) {
                System.out.println(1);
            }
            for (i = 3; i <= n; i++) {
                c = a + b;
                System.out.println(c);
                a = b;
                b=c;
            }

        }
    }

}

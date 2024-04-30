import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for prime numbers : ");
        n = sc.nextInt();
        boolean isPrime = true;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Number " + n + " is not prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number " + n + " is prime");
        }
        // else{
        //     System.out.println("Number " + n + " is not prime");
        // }


        // Close the Scanner object to prevent resource leak
        sc.close();
        // Scanner.close();

    }
}

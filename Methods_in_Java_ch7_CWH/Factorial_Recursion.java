package Methods_in_Java_ch7_CWH;
public class Factorial_Recursion {
    static int fact(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return 1;
        else{
            // return n * fact(n - 1);  //Recursion ..............
            int product = 1;
            for(int i=1;i<=n;i++)
            {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int number = 6;
        if (fact(number) == -1) {
            System.err.println("Enter a positive number ");
        } else {
            System.out.println("The factorial of " + number + " is " + fact(number));
        }
    }

}

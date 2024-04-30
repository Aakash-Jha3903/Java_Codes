public class Variable_Arguments {
    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    static int compulsary_one_argument_sum(int a, int... arr) { // first value is for int a(compulsory) and rest of the
                                                                // value is for int arr ..........
        int result = 0;
        int one = a;
        for (int i : arr) {
            result += i;
        }
        System.out.println("(printed) the result is " + result);
        System.out.println("(printed) the value of one is " + one);
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("The sum of 2 + 5 + 8 + 10 is " + sum(2, 5, 8, 10));
        // System.out.println("The sum of NONE,i.e, sum() is " + sum());

        System.out.println("The sum of 5 with (int one and arr) is   " + compulsary_one_argument_sum(5));
        System.out.println("The sum of 5 + 10 + 15 with (int one and arr) is " + compulsary_one_argument_sum(5, 10, 15));

    }
}

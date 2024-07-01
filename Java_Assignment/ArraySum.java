/* Q8. Write definitions for two versions of an overloaded function.
This function's 1st version sum() takes an argument, int array,
and returns the sum of all the elements of the passed array.
The 2nd version of sum() takes two arguments, an int array and 
a character (E or O). If the passed character is E it returns the sum of
even elements of the passed array and if the passed character is O
it returns the sum of odd elements. 
In case of any other character, it returns 0. */

public class ArraySum {
    public int sum(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        return totalSum;
    }

    public int sum(int[] array, char type) {
        int totalSum = 0;
        if (type == 'E') {
            for (int num : array) {
                if (num % 2 == 0) {
                    totalSum += num;
                }
            }
        } else if (type == 'O') {
            for (int num : array) {
                if (num % 2 != 0) {
                    totalSum += num;
                }
            }
        } else {
            return 0;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int totalSum = arraySum.sum(array);
        System.out.println("Total sum of all elements: " + totalSum);
        int evenSum = arraySum.sum(array, 'E');
        System.out.println("Sum of even elements: " + evenSum);
        int oddSum = arraySum.sum(array, 'O');
        System.out.println("Sum of odd elements: " + oddSum);
        int invalidSum = arraySum.sum(array, 'X');
        System.out.println("Sum with invalid character: " + invalidSum);
    }
}

import java.util.Scanner;

public class AyyarPracticeSet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float[] marks = { 10, 20, 30, 40, 50 };
        // System.out.println(marks);
        System.out.println("Enter the question number : ");
        int question = sc.nextInt();

        switch (question) {
            case 1:
                // Q1) Sum of array elements......................

                float sum = 0;
                for (float i : marks) {
                    sum = sum + i;
                    // System.out.println(i);

                }
                System.out.println("The sum of the elements in marks is " + sum);
                break;

            case 2:
                // Q2) Check the presence of an item in array......................

                System.out.print("Enter the item to check the presence of in the array : ");
                float item = sc.nextFloat();

                boolean found = false;
                for (float i : marks) {
                    if (i == item) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.print(item + " is present in marks");
                } else {
                    System.out.print(item + " is NOT present in marks");
                }
                break;

            case 3:
                // Q3) Sum of array elements......................

                float s = 0;
                for (float i : marks) {
                    s = s + i;
                }
                System.out.println("The average of the elements in marks is " + s / marks.length);
                break;

            case 4:
                // Q4) reverse the array...............
                for (int i = marks.length - 1; i > 0; i--) {
                    System.out.println(marks[i]);
                }
                break;

            case 5:
                // Q5) Addition of two matrixes ...........
                int[][] m1 = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 } };
                int[][] m2 = { { 2, 4, 6, 8 }, { 10, 12, 14, 16 } };
                int[][] mat_sum = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

                for (int i = 0; i < m1.length; i++) { // row no. of times
                    // for (int j = 0; j < m2[i].lenght ; j++) { // lenght ?
                    for (int j = 0; j < m2[i].length; j++) { // column no.of times
                        mat_sum[i][j] = m1[i][j] + m2[i][j];
                        System.out.printf("%d \t", mat_sum[i][j]);
                    }
                    System.out.println("");
                }

            case 6:
                // Q6) Reverse a array .........................
                int [] arr = { 10, 20, 30, 40, 50 };
                // for(int i= arr.length-1; i>=0 ; i--) {
                // System.out.println(arr[i]);
                // }
                int l = arr.length;
                int temp;
                for (int i = 0; i < l / 2; i++) { // L/2 for half access swap
                    temp = arr[i]; // swap ........
                    arr[i] = arr[l - i - 1];
                    arr[l - i - 1] = temp;
                }
                for (int i : arr) {
                    System.out.println(i);
                }

            case 7:
                // Q7) find the max. or min. element in array
                int [] arr1 = { 0, 1, 2, 4, 5 };
                int max = arr1[0];
                for (int i : arr1) {
                    if (max < i) {
                        max = i;
                    }
                }
                System.out.println("Maximun elemwnt is "+ max);

                
                case 8 :
                //Q8) check whether the array is sorted  or not 
                int [] arr2 = {0,1,2,3,4,5,6,7,8,9,10};
                boolean isSorted = true;
                for(int i=0; i<arr2.length -1 ;i++) {
                    if(arr2[i]>arr2[i+1]) {
                        isSorted = false;
                        break;
                    }
                }
                if(isSorted) {
                    System.out.println("Array is sorted");
                }else{
                System.out.println("Array is NOT sorted");
                }

                // sc.close();
            }
    }
}

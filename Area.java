import java.util.Scanner;

class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : "); // print for same line input **************
        int height = sc.nextInt();

        System.out.print("Enter the width : "); // print for same line input **************
        int width = sc.nextInt();

        float area = 0.5F* height * width;
        System.out.print("Area : "+area); // print for same line input ************
        

    }

}

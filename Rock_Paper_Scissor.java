import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int score = 0;
            System.out.println("1:rock    2:paper   3:scissor  0:Exit");
            int user = sc.nextInt();
            Random rand = new Random();
            int comp = rand.nextInt(3);
            if (user == 0) {
                System.out.println("Your Score " + score);
                break;
            } else if (user == comp) {
                System.out.println("Draw");
            } else if (user == 1 && comp == 3 || user == 2 && comp == 1 || user == 3 && comp == 2) {
                score += 1;
                System.out.println("You Win!");
            } else {
                score -= 1;
                System.out.println("Computer Win!");
            }
            if (comp == 1) {
                System.out.println("Computer : Rock");
            } else if (comp == 2) {
                System.out.println("Computer : Paper");
            } else {
                System.out.println("Computer : Scissor");
            }
        }
    }

}

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Calculate 7 to the power of 4. You have three attempts!");
        System.out.println("If you want to surrender, enter 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer");
        for (int i = 0; i < 3; i++) {
            double number = sc.nextDouble();
            if (number==0) {
                System.out.println("You surrender!");
                break;
            }
            if (number == 2401) {
                System.out.println("You win!");
                break;
            } else if (number != 2401 && i < 2) {
                System.out.println("Try to enter the answer again");
            } else {
                System.out.println("You lose!");
            }
        }
    }
}

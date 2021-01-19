import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static final Random RANDOM = new Random();
    private static final int MAX_BOUND = 100;
    private static final int MIN_BOUND = 0;

    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hidden number");
        int userNumber = sc.nextInt();
        int computerNumber = 0;
        if (userNumber <= 100 && userNumber >= 0) {
            System.out.println("The computer guesses the number");
            do {
                counter++;
                computerNumber = RANDOM.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
                if (computerNumber == userNumber)
                    System.out.println("The computer win!Number of attempts= " + counter);
            }
            while (computerNumber != userNumber);
        } else {
            System.out.println("You entered an incorrect number");
        }
    }
}

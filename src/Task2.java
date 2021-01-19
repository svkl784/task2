import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int numberMoth = sc.nextInt();
        int[] daysOfMoth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int entry = 0;
        if (numberMoth <= daysOfMoth.length) {
            System.out.println("Enter the day number");
            int numberDay = sc.nextInt();
            entry = daysOfMoth[numberMoth - 1];
            if (entry >= numberDay) {
                System.out.println("The month includes such a day");
            } else {
                System.out.println("There is no such day");
            }
        } else {
            System.out.println("There is no such month");
        }

    }
}

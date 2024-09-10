
import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        // Determine the season based on the month using switch-case
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }

        // Close the scanner
        scanner.close();
    }
}

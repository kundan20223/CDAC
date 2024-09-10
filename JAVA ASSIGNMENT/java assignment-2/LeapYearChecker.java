import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Using if-else
        checkLeapYearIfElse(year);
        
        // Using switch-case
        checkLeapYearSwitchCase(year);
    }

    // Method to check leap year using if-else
    private static void checkLeapYearIfElse(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year (Checked using if-else).");
        } else {
            System.out.println(year + " is not a leap year (Checked using if-else).");
        }
    }

    // Method to check leap year using switch-case
    private static void checkLeapYearSwitchCase(int year) {
        int isLeap = 0; // 0 means not a leap year, 1 means leap year

        // Check divisibility conditions for leap year
        switch (0) {
            case 0:
                if (year % 4 == 0) {
                    isLeap = 1;
                }
                // fall through
            case 1:
                if (year % 100 == 0) {
                    isLeap = 0;
                }
                // fall through
            case 2:
                if (year % 400 == 0) {
                    isLeap = 1;
                }
                break;
            default:
                isLeap = 0;
                break;
        }

        // Output result based on isLeap value
        switch (isLeap) {
            case 1:
                System.out.println(year + " is a leap year (Checked using switch-case).");
                break;
            default:
                System.out.println(year + " is not a leap year (Checked using switch-case).");
                break;
        }
    }
}

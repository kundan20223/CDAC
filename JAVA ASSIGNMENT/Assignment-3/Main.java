
import java.util.Scanner;

class CompoundInterestCalculator {
    // Fields to store investment details
    double principal;
    double annualInterestRate;
    int numberOfCompounds;
    int years;
    double futureValue;
    double totalInterest;

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accept initial investment amount
        System.out.print("Enter the initial investment amount (₹): ");
        principal = scanner.nextDouble();
        
        // Accept annual interest rate
        System.out.print("Enter the annual interest rate (%): ");
        annualInterestRate = scanner.nextDouble();
        
        // Accept number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();
        
        // Accept investment duration in years
        System.out.print("Enter the investment duration (years): ");
        years = scanner.nextInt();
    }

    // Method to calculate future value using compound interest formula
    public void calculateFutureValue() {
        double ratePerCompound = annualInterestRate / 100 / numberOfCompounds;
        futureValue = principal * Math.pow(1 + ratePerCompound, numberOfCompounds * years);
        totalInterest = futureValue - principal;
    }

    // Method to print the future value and total interest earned
    public void printRecord() {
        System.out.printf("Future Value of Investment: ₹%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of CompoundInterestCalculator
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        
        // Accept user inputs
        calculator.acceptRecord();
        
        // Calculate the future value and total interest
        calculator.calculateFutureValue();
        
        // Display the results
        calculator.printRecord();
    }
}

 

import java.util.Scanner;

class LoanAmortizationCalculator {
    
    // Fields to store loan details
    double principal;
    double annualInterestRate;
    int loanTerm;

    // Method to accept user input (principal, annual interest rate, loan term in years)
    public void acceptRecord(double principalAmount, double interestRate, int termInYears) {
        principal = principalAmount;
        annualInterestRate = interestRate;
        loanTerm = termInYears;
    }

    // Method to calculate the monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // Method to print the monthly payment and total amount paid
    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalPayment = monthlyPayment * loanTerm * 12;

        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total Amount Paid Over the Life of the Loan: ₹%.2f%n", totalPayment);
    }
}

public class Program {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of LoanAmortizationCalculator
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();

        // Accept inputs from the user
        System.out.print("Enter the principal amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        int loanTerm = scanner.nextInt();

        // Use the calculator to accept the record
        calculator.acceptRecord(principal, annualInterestRate, loanTerm);

        // Print the monthly payment and total payment
        calculator.printRecord();

        // Close the scanner
        scanner.close();
    }

}

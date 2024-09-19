
import java.util.Scanner;

// Define the DiscountCalculator class with necessary methods
class DiscountCalculator {
    // Fields to store the original price, discount rate, discount amount, and final price
    double originalPrice;
    double discountRate;
    double discountAmount;
    double finalPrice;

    // Method to accept user input for the original price and discount rate
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the original price of the item
        System.out.print("Enter the original price of the item (₹): ");
        originalPrice = scanner.nextDouble();
        
        // Accept the discount percentage
        System.out.print("Enter the discount percentage (%): ");
        discountRate = scanner.nextDouble();
    }

    // Method to calculate the discount amount and final price
    public void calculateDiscount() {
        // Calculate the discount amount
        discountAmount = originalPrice * (discountRate / 100);
        
        // Calculate the final price after applying the discount
        finalPrice = originalPrice - discountAmount;
    }

    // Method to print the discount amount and the final price
    public void printRecord() {
        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price after Discount: ₹%.2f%n", finalPrice);
    }
}

// Main class to test the DiscountCalculator functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of DiscountCalculator
        DiscountCalculator discountCalculator = new DiscountCalculator();
        
        // Accept the original price and discount rate from the user
        discountCalculator.acceptRecord();
        
        // Calculate the discount and final price
        discountCalculator.calculateDiscount();
        
        // Print the results
        discountCalculator.printRecord();
    }
}

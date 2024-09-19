
import java.util.Scanner;

// Define the TollBoothRevenueManager class with necessary methods
class TollBoothRevenueManager {
    // Fields to store toll rates for different vehicle types
    double carRate;
    double truckRate;
    double motorcycleRate;

    // Fields to store the count of vehicles of each type
    int carCount;
    int truckCount;
    int motorcycleCount;

    // Field to store the total revenue
    double totalRevenue;

    // Method to set toll rates for Car, Truck, and Motorcycle
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        // Accept toll rate for cars
        System.out.print("Enter the toll rate for Car (₹): ");
        carRate = scanner.nextDouble();

        // Accept toll rate for trucks
        System.out.print("Enter the toll rate for Truck (₹): ");
        truckRate = scanner.nextDouble();

        // Accept toll rate for motorcycles
        System.out.print("Enter the toll rate for Motorcycle (₹): ");
        motorcycleRate = scanner.nextDouble();
    }

    // Method to accept the count of vehicles of each type
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of cars
        System.out.print("Enter the number of Cars: ");
        carCount = scanner.nextInt();

        // Accept the number of trucks
        System.out.print("Enter the number of Trucks: ");
        truckCount = scanner.nextInt();

        // Accept the number of motorcycles
        System.out.print("Enter the number of Motorcycles: ");
        motorcycleCount = scanner.nextInt();
    }

    // Method to calculate total revenue based on vehicle counts and toll rates
    public void calculateRevenue() {
        totalRevenue = (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

    // Method to print the total number of vehicles and total revenue
    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f%n", totalRevenue);
    }
}

// Main class to test the TollBoothRevenueManager functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of TollBoothRevenueManager
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();

        // Set the toll rates for different vehicle types
        tollBooth.setTollRates();

        // Accept the count of vehicles passing through the toll booth
        tollBooth.acceptRecord();

        // Calculate the total revenue collected
        tollBooth.calculateRevenue();

        // Print the total number of vehicles and total revenue collected
        tollBooth.printRecord();
    }
}

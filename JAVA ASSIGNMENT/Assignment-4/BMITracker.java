
import java.util.Scanner;

class BMITracker {
    // Fields to store weight, height, BMI value, and classification
    double weight;
    double height;
    double bmi;
    String classification;

    // Method to accept user input for weight and height
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        // Accept weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        weight = scanner.nextDouble();
        
        // Accept height in meters
        System.out.print("Enter height in meters: ");
        height = scanner.nextDouble();
    }

    // Method to calculate BMI using the formula BMI = weight / (height * height)
    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    // Method to classify the BMI into categories
    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    // Method to print the BMI value and its classification
    public void printRecord() {
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("BMI Classification: " + classification);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of BMITracker
        BMITracker bmiTracker = new BMITracker();
        
        // Accept user inputs
        bmiTracker.acceptRecord();
        
        // Calculate the BMI
        bmiTracker.calculateBMI();
        
        // Classify the BMI
        bmiTracker.classifyBMI();
        
        // Display the results
        bmiTracker.printRecord();
    }
}

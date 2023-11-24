package lab03.OtherProjects.lab01;

// Example 5: Calculator.java

import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        // Get input from user using dialog boxes
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(strNum2);

        // Calculate sum, difference, product, and quotient
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        // Check divisor for division
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: Division by zero is not allowed.");
            System.exit(0); // Exit the program if there's a division by zero
        }

        // Display the results using dialog boxes
        JOptionPane.showMessageDialog(
                null, "Sum: " + sum + "\nDifference: " + difference +
                        "\nProduct: " + product + "\nQuotient: " + quotient);
    }
}
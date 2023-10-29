package Lab01;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: Division by zero is not allowed.");
            System.exit(0); // Exit the program if there's a division by zero
        }

        JOptionPane.showMessageDialog(
                null, "Sum: " + sum + "\nDifference: " + difference +
                        "\nProduct: " + product + "\nQuotient: " + quotient);
    }
}
package lab03.OtherProjects.lab01;

// Exercise 6.3: TriangleStars.java
import java.util.Scanner;
public class TriangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        // Loop to print the triangle pattern based on user input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
        // Print stars to form the triangular pattern
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        // Move to the next line for the next row of the triangle
        System.out.println();
        }

        scanner.close();
    }
}

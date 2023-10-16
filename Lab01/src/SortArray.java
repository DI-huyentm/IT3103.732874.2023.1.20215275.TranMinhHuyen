import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if they want to enter their own array or use a constant array
        System.out.print("Do you want to enter your own array? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();

        int[] numericArray;

        if (choice.equals("yes")) {
            // User enters their own array
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            numericArray = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numericArray[i] = scanner.nextInt();
            }
        } else {
            // Use a constant array for demonstration
            numericArray = new int[]{5, 2, 9, 1, 7};
        }

        // Sort the array
        Arrays.sort(numericArray);

        // Calculate sum and average value of the array
        int sum = 0;
        for (int num : numericArray) {
            sum += num;
        }
        double average = (double) sum / numericArray.length;

        // Display sorted array, sum, and average
        System.out.println("Sorted Array: " + Arrays.toString(numericArray));
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);

        scanner.close();
    }
}

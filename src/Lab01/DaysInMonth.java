package Lab01;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December",
                "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
                "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        // Input month
        int monthIndex = -1;
        while (monthIndex == -1) {
            System.out.print("Enter a month (full name, abbreviation, or number): ");
            String inputMonth = scanner.nextLine();

            try {
                int numericInput = Integer.parseInt(inputMonth);
                if (numericInput >= 1 && numericInput <= 12) {
                    monthIndex = numericInput - 1; // 0-based index
                }
            } catch (NumberFormatException e) {
                // Input is not numeric, check if it matches a month name or abbreviation
                for (int i = 0; i < months.length; i++) {
                    if (months[i].equalsIgnoreCase(inputMonth)) {
                        monthIndex = i % 12; // Ensure the index is in the range [0, 11]
                        break;
                    }
                }
            }

            if (monthIndex == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        // Input year
        int inputYear;
        while (true) {
            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()) {
                inputYear = scanner.nextInt();
                if (inputYear >= 0 && inputYear <= 9999) {
                    break;
                }
            }
            scanner.nextLine(); // Consume the invalid input
            System.out.println("Invalid year. Please enter a non-negative integer year between 0 and 9999.");
        }

        // Determine if the year is a leap year
        boolean isLeapYear = (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);

        // Mapping months to their respective number of days
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Display the number of days in the specified month of the given year
        int numberOfDays = daysInMonth[monthIndex];
        System.out.println("Number of days in " + months[monthIndex] + " " + inputYear + ": " + numberOfDays);

        scanner.close();
    }
}
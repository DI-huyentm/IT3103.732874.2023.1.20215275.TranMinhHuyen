package lab01;

// Exercise 6.1: ChoosingOption.java
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        // Display a confirmation dialog: Yes or No
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        // Display a message dialog based on the user's choice
        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION? "Yes" : "No") );
        System.exit(0);
    }
}

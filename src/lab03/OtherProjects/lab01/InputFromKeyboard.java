package lab03.OtherProjects.lab01;

// Exercise 6.2: InputFromKeyboard.java
import java.util.Scanner;
public class InputFromKeyboard{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        // Get information input from user
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        // Display a message with the user's name, age, and height
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "
                        + "Your height is " + dHeight + ".");

    }
}
import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] options = {"First-degree equation with one variable",
                "System of first-degree equations with two variables",
                "Second-degree equation with one variable"};
        int choice = JOptionPane.showOptionDialog(
                null, "Choose an equation type to solve:",
                "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0:
                solveFirstDegreeEquation();
                break;
            case 1:
                solveLinearSystem();
                break;
            case 2:
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice");
        }
    }

    private static void solveFirstDegreeEquation() {
        String strA = JOptionPane.showInputDialog("Enter coefficient 'a':");
        double a = Double.parseDouble(strA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input: 'a' cannot be 0 in a first-degree equation.");
        } else {
            String strB = JOptionPane.showInputDialog("Enter coefficient 'b':");
            double b = Double.parseDouble(strB);
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Root (x): " + x);
        }
    }

    private static void solveLinearSystem() {
        String strA11 = JOptionPane.showInputDialog("Enter coefficient 'a11':");
        double a11 = Double.parseDouble(strA11);
        String strA12 = JOptionPane.showInputDialog("Enter coefficient 'a12':");
        double a12 = Double.parseDouble(strA12);
        String strA21 = JOptionPane.showInputDialog("Enter coefficient 'a21':");
        double a21 = Double.parseDouble(strA21);
        String strA22 = JOptionPane.showInputDialog("Enter coefficient 'a22':");
        double a22 = Double.parseDouble(strA22);

        String strB1 = JOptionPane.showInputDialog("Enter constant 'b1':");
        double b1 = Double.parseDouble(strB1);
        String strB2 = JOptionPane.showInputDialog("Enter constant 'b2':");
        double b2 = Double.parseDouble(strB2);

        double determinant = a11 * a22 - a21 * a12;

        if (determinant == 0) {
            if (a11 / a21 == b1 / b2) {
                JOptionPane.showMessageDialog(null,
                        "Infinite solutions: The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "No solution: The system has no solution.");
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            JOptionPane.showMessageDialog(null,
                    "Roots (x1, x2): " + x1 + ", " + x2);
        }
    }

    private static void solveQuadraticEquation() {
        String strA = JOptionPane.showInputDialog("Enter coefficient 'a':");
        double a = Double.parseDouble(strA);
        String strB = JOptionPane.showInputDialog("Enter coefficient 'b':");
        double b = Double.parseDouble(strB);
        String strC = JOptionPane.showInputDialog("Enter coefficient 'c':");
        double c = Double.parseDouble(strC);

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input: 'a' cannot be 0 in a quadratic equation.");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                    "Roots (x1, x2): " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Double root: " + root);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No real roots: The quadratic equation has no real roots.");
        }
    }
}

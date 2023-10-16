// HelloNameDialog.java

import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main ( String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Tran Minh Huyen - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Tran Minh Huyen. Hello " + result +"!");
        System.exit(0);
    }
}

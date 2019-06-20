package interfaceGui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter second number");

        int numberOne = Integer.parseInt(firstNumber);
        int numberTwo = Integer.parseInt(secondNumber);
        int sum = numberOne + numberTwo;

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Sum", JOptionPane.PLAIN_MESSAGE); // where to position it (middle), text, title
    }
}
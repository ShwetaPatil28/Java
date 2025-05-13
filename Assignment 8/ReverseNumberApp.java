import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseNumberApp {

    public ReverseNumberApp() {
        // Create the frame
        JFrame frame = new JFrame("Reverse Number Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create input label and text field
        JLabel inputLabel = new JLabel("Enter Number:");
        JTextField inputField = new JTextField(15);

        // Create result label and text field
        JLabel resultLabel = new JLabel("Reversed Number:");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        // Create button to reverse the number
        JButton reverseButton = new JButton("Reverse");

        // Add action listener to the reverse button
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputText = inputField.getText();
                    int number = Integer.parseInt(inputText);
                    int reversedNumber = reverseNumber(number);
                    resultField.setText(String.valueOf(reversedNumber));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }

            private int reverseNumber(int number) {
                int reversed = 0;
                while (number != 0) {
                    int digit = number % 10;
                    reversed = reversed * 10 + digit;
                    number /= 10;
                }
                return reversed;
            }
        });

        // Add components to the frame
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(reverseButton);

        // Set frame visibility
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ReverseNumberApp();
    }
}

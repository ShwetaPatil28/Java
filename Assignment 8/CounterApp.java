import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private int count = 0; // Counter value

    public CounterApp() {
        // Create the frame
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create the label and text field
        JLabel label = new JLabel("Counter");
        JTextField textField = new JTextField(10);
        textField.setEditable(false);
        textField.setText(String.valueOf(count));

        // Create buttons
        JButton countUpButton = new JButton("Count Up");
        JButton countDownButton = new JButton("Count Down");
        JButton resetButton = new JButton("Reset");

        // Add action listeners for buttons
        countUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                textField.setText(String.valueOf(count));
            }
        });

        countDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                textField.setText(String.valueOf(count));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                textField.setText(String.valueOf(count));
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(countUpButton);
        frame.add(countDownButton);
        frame.add(resetButton);

        // Set frame visibility
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}

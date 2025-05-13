import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your gender:");
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(label);

        ButtonGroup genderGroup = new ButtonGroup();

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("Arial", Font.PLAIN, 12));
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("Arial", Font.PLAIN, 12));
        JRadioButton otherButton = new JRadioButton("Other");
        otherButton.setFont(new Font("Arial", Font.PLAIN, 12));

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(otherButton);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 12));
        submitButton.setBackground(Color.LIGHT_GRAY);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGender = null;
                if (maleButton.isSelected()) {
                    selectedGender = "Male";
                } else if (femaleButton.isSelected()) {
                    selectedGender = "Female";
                } else if (otherButton.isSelected()) {
                    selectedGender = "Other";
                }

                if (selectedGender != null) {
                    JOptionPane.showMessageDialog(frame, "You selected: " + selectedGender);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a gender.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

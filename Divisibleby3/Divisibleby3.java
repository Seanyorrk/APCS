package Divisibleby3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;

public class Divisibleby3 {
    JFrame frame;
    JLabel label;
    JLabel answer;
    JPanel contentpane;
    JButton button;
    JTextField textfield;

    public Divisibleby3() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentpane = new JPanel();
        contentpane.setLayout(new GridLayout(3, 1, 0, 10)); // Use GridLayout manager with 3 rows and 1 column

        label = new JLabel("Enter an integer:");
        contentpane.add(label);

        answer = new JLabel("Yes");
        answer.setVisible(false); // Hide the answer label initially
        contentpane.add(answer);
        

        textfield = new JTextField();
        contentpane.add(textfield);

        button = new JButton("Check");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textfield.getText());
                if (num % 3 == 0) {
                    answer.setText("Yes");
                } else {
                    answer.setText("No");
                }
                answer.setVisible(true); // Show the answer label when the button is pressed
            }
        });
        contentpane.add(button);
        frame.setContentPane(contentpane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Divisibleby3();
    }
}

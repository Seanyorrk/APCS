package Sunflower;

import javax.swing.*;
import java.awt.event.*;

public class Sunflower {

    JFrame frame;
    JLabel label;
    JPanel contentpane;
    JButton latinButton;
    JButton englishButton;

    String latin = "Helianthus";
    String common = "Sunflower";

    public Sunflower() {
        frame = new JFrame("Sunflower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentpane = new JPanel();
        contentpane.setLayout (new BoxLayout(contentpane, BoxLayout.PAGE_AXIS));
        contentpane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        label = new JLabel("Helianthus");
        contentpane.add(label);

        latinButton = new JButton("Latin");

        // Existing code...

        latinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(latin);
            }
        });
        contentpane.add(latinButton);

        englishButton = new JButton("English");
        englishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(common);
            }
        });
        contentpane.add(englishButton);

        frame.setContentPane(contentpane);

        frame.pack();

        frame.setVisible(true);
        }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Sunflower sunflower = new Sunflower();


    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
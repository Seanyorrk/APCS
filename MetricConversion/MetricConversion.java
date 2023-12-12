package MetricConversion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;


public class MetricConversion {
    JFrame frame;
    JLabel label;
    JLabel answer;
    JPanel contentpane;
    JButton button;
    JComboBox combobox;

    public MetricConversion() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentpane = new JPanel();
    contentpane.setLayout(new GridLayout(3, 1, 0, 10)); // Use GridLayout manager with 3 rows and 1 column

    label = new JLabel("Select a conversion type:");
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    contentpane.add(label);

   


    String [] conversions = {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"};

    combobox = new JComboBox(conversions);
    combobox.setAlignmentX(Component.CENTER_ALIGNMENT);
    combobox.setSelectedIndex(0);
    combobox.addActionListener(e -> {
        JComboBox cb = (JComboBox)e.getSource();
        String conversion = (String)cb.getSelectedItem();
        if (conversion.equals("Inches to Centimeters")) {
            answer.setText("1 inch = 2.54 centimeters");
        } else if (conversion.equals("Feet to Meters")) {
            answer.setText("1 foot = 0.3048 meters");
        } else if (conversion.equals("Gallons to Liters")) {
            answer.setText("1 gallon = 3.785 liters");
        } else if (conversion.equals("Pounds to Kilograms")) {
            answer.setText("1 pound = 0.453592 kilograms");
        }
    });

     answer = new JLabel(" ");
    answer.setVisible(true); // Hide the answer label initially
    answer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    contentpane.add(answer);
    contentpane.add(combobox);

    contentpane.add(answer);

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
        new MetricConversion();
    }
}

    

    

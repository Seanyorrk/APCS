package Riddle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Riddle {
    JFrame frame;
    JLabel label;
    JLabel answer;
    JPanel contentpane;
    JButton button;

    public Riddle () {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentpane = new JPanel();
        contentpane.setLayout(new GridLayout(3, 1)); // Use GridLayout manager with 3 rows and 1 column

        label = new JLabel("Why did the chicken cross the road?");
        contentpane.add(label);

        answer = new JLabel("To get to the other side");
        answer.setVisible(false); // Hide the answer label initially
        contentpane.add(answer);

        button = new JButton("Answer");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answer.setVisible(true); // Show the answer label when the button is pressed
            }
        });

        contentpane.add(button);

        frame.setContentPane(contentpane);

        frame.pack();

        frame.setVisible(true);


    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Riddle();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}

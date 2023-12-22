package Roll;
import javax.swing.*;


import java.awt.event.*;
import java.awt.GridLayout;
import java.util.Random;
import java.awt.color.*;


public class Roll {
    JFrame frame;
    JLabel dieFace1;
    JLabel dieFace2;
    JPanel contentpane;
    JButton rollDie;

    public Roll() {
     
        frame = new JFrame("Roll");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentpane = new JPanel();
        contentpane.setLayout(new GridLayout(3,0,10,100)); // Use GridLayout manager with 3 rows and 1 column
        contentpane.setBackground(new java.awt.Color(128, 0, 128));

        dieFace1 = new JLabel(new ImageIcon("die1.gif"));
        dieFace1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        dieFace1.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        contentpane.add(dieFace1);

        dieFace2 = new JLabel(new ImageIcon("die1.gif"));
        dieFace2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        dieFace2.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        contentpane.add(dieFace2);

        rollDie = new JButton("Roll");
        rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
        rollDie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int roll1 = rand.nextInt(6) + 1;
                int roll2 = rand.nextInt(6) + 1;
                dieFace1.setIcon(new ImageIcon("I:\\APCS\\Roll\\img\\die" + roll1 + ".gif"));
                dieFace2.setIcon(new ImageIcon("I:\\APCS\\Roll\\img\\die" + roll2 + ".gif"));
            } 
        });

        contentpane.add(rollDie);

        frame.setContentPane(contentpane);

        frame.pack();
        frame.setVisible(true);


    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Roll();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }




}


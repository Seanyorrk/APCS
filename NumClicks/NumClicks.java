package NumClicks;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumClicks {
    //Create a apllication that contains a button displaying how many times the user has clicked the button.
int numClicks = 1;
JLabel button;
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumClicks();
            }
        });
    }

    public NumClicks() {
        javax.swing.JFrame frame = new javax.swing.JFrame("NumClicks");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       
       javax.swing.JPanel contentpane = new javax.swing.JPanel();

        

        javax.swing.JButton button = new javax.swing.JButton("Click Me");
        button.addActionListener(e -> {
            button.setText("You have clicked me " + Integer.toString(numClicks++) + " times");
        });
        contentpane.add(button);

        frame.setContentPane(contentpane);


        frame.pack();
        frame.setVisible(true);


    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        String eventName = e.getActionCommand();
        if(eventName.equals("Click Me")) {
           
            numClicks++;
            button.setText(Integer.toString(numClicks));
        }
        else {
            button.setText("You clicked me " + numClicks + " times ");
        }
    }   
    public static void RunGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        

    }


}

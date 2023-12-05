package Name;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Name {
    final static String NAME = "Sean York";
    JFrame frame;
    JLabel label;
    JPanel contentpane;
    JButton button;

    public Name() {

        frame = new JFrame("Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentpane = new JPanel();

        label = new JLabel(NAME);
        contentpane.add(label);

        button = new JButton("Hide");
        button.setActionCommand("Hide");
        button.addActionListener(e -> {
            String eventName = e.getActionCommand();
            if (eventName.equals("Hide")) {
                label.setText("   ");
                button.setText("Show");
                button.setActionCommand("Show");
            } else {
                label.setText(NAME);
                button.setText("Hide");
                button.setActionCommand("Hide");
            }
        });
        contentpane.add(button);

        frame.setContentPane(contentpane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Name name = new Name();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

package GameofLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameofLight {

    JFrame frame;
    JPanel panel;
    JButton[][] buttons;
    int rows, cols;

    public GameofLight() {
        frame = new JFrame("Game of Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // create a content pane with a grid layout and empty borders
        // ask player to enter size of the grid
        // ask player to enter size of the grid and use a text field to get the input
        JTextField rowField = new JTextField(5);
        JTextField colField = new JTextField(5);
        JPanel rowPanel = new JPanel();
        rowPanel.add(new JLabel("Enter the number of rows: "));
        rowPanel.add(rowField);
        JPanel colPanel = new JPanel();
        colPanel.add(new JLabel("Enter the number of columns: "));
        colPanel.add(colField);
        int result = JOptionPane.showConfirmDialog(null, rowPanel, "Enter the number of rows",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            rows = Integer.parseInt(rowField.getText());
        }
        result = JOptionPane.showConfirmDialog(null, colPanel, "Enter the number of columns",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            cols = Integer.parseInt(colField.getText());
        }

        panel = new JPanel();
        panel.setLayout(new GridLayout(rows, cols, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // create a 2D array of buttons and all their properties in nested for loops

        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String actionCommand = button.getActionCommand();
                int row = Integer.parseInt(actionCommand.split(",")[0]);
                int col = Integer.parseInt(actionCommand.split(",")[1]);

                // Check if the clicked cell is already white
                if (buttons[row][col].getBackground() == Color.WHITE) {
                    // Change the clicked cell and surrounding cells to black
                    buttons[row][col].setBackground(Color.BLACK);
                    if (row > 0) {
                        buttons[row - 1][col].setBackground(Color.BLACK);
                    }
                    if (row < buttons.length - 1) {
                        buttons[row + 1][col].setBackground(Color.BLACK);
                    }
                    if (col > 0) {
                        buttons[row][col - 1].setBackground(Color.BLACK);
                    }
                    if (col < buttons[row].length - 1) {
                        buttons[row][col + 1].setBackground(Color.BLACK);
                    }
                } else {
                    // Change the clicked cell and surrounding cells to white
                    buttons[row][col].setBackground(Color.WHITE);
                    if (row > 0) {
                        buttons[row - 1][col].setBackground(Color.WHITE);
                    }
                    if (row < buttons.length - 1) {
                        buttons[row + 1][col].setBackground(Color.WHITE);
                    }
                    if (col > 0) {
                        buttons[row][col - 1].setBackground(Color.WHITE);
                    }
                    if (col < buttons[row].length - 1) {
                        buttons[row][col + 1].setBackground(Color.WHITE);
                    }
                } 
            }
        }

        // play the game



        buttons = new JButton[rows][cols];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setText("O");
                buttons[i][j].setBackground(Color.BLACK);
                buttons[i][j].setForeground(Color.WHITE);
                buttons[i][j].setOpaque(true);
                buttons[i][j].setBorderPainted(false);
                buttons[i][j].setActionCommand(i + "," + j);
                buttons[i][j].addActionListener(new ButtonListener());
                panel.add(buttons[i][j]);
            }
        }

        // add the panel to the frame
            int row = 0; // Add this line to declare and initialize the variable row
            int col = 0; // Add this line to declare and initialize the variable col
            char[][] grid = new char[rows][cols]; // Declare the variable grid as a 2D array of characters

            frame.getContentPane().add(panel);

            // display the frame
            frame.pack();
            frame.setVisible(true);

            // change the clicked cell and surrounding cells
            row--;
            col--;
            if (grid[row][col] == 'O') {
                grid[row][col] = 'X';
                if (row > 0) {
                    if (grid[row - 1][col] == 'O') {
                        grid[row - 1][col] = 'X';
                    } else {
                        grid[row - 1][col] = 'O';
                    }
                }
                if (row < grid.length - 1) {
                    if (grid[row + 1][col] == 'O') {
                        grid[row + 1][col] = 'X';
                    } else {
                        grid[row + 1][col] = 'O';
                    }
                }
                if (col > 0) {
                    if (grid[row][col - 1] == 'O') {
                        grid[row][col - 1] = 'X';
                    } else {
                        grid[row][col - 1] = 'O';
                    }
                }
                if (col < grid[row].length - 1) {
                    if (grid[row][col + 1] == 'O') {
                        grid[row][col + 1] = 'X';
                    } else {
                        grid[row][col + 1] = 'O';
                    }
                }
              

            // add game logic here
            boolean gameWon = checkGameWon();
            if (gameWon) {
                JOptionPane.showMessageDialog(null, "You won!");
            }
        }
        }

        private boolean checkGameWon() {
            // Add your game winning logic here
            return false;
        }


    



    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        new GameofLight();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
               

            }

        });

    }
}

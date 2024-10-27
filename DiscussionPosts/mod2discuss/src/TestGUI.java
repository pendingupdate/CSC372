package mod2discuss.src;

import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {
        // Create a new frame with title
        JFrame frame = new JFrame("My JFrame");

        // Set frame's default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 150);

        // Create a panel to hold button components
        JPanel buttonPanel = new JPanel();

        // Create button components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Add buttons to the panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        // Set GridLayout as panel's layout manager with specified number of rows and
        // columns
        buttonPanel.setLayout(new GridLayout(2, 2));

        // Add the panel to the frame
        frame.add(buttonPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

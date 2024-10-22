import javax.swing.*;
import java.awt.*;

public class Disc2Example {
    public static void main(String[] args) {
        // Creates a frame
        JFrame frame = new JFrame("The Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        
        // Creates a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        
        // Creates a label
        JLabel label = new JLabel("Components that can be added to a panel");
        panel.add(label);
        
        // Creates a button
        JButton button = new JButton("Button");
        panel.add(button);
        
        // Creates a text field
        JTextField textField = new JTextField("Text Field :)");
        panel.add(textField);

        // Add a slider
        JSlider slider = new JSlider(0, 20, 10);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true); 
        slider.setPaintLabels(true);
        panel.add(slider);

        frame.add(panel);
        frame.setVisible(true);
    }
}
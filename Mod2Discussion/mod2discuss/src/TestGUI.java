import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGUI {
    public static void main(String[] args) {
        // Create a new frame with title
        JFrame frame = new JFrame("My JFrame");
        
        // Set frame's default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        // Set the size of the frame
        frame.setSize(300, 150);
        
        // Create a panel to hold button component
        JPanel buttonPanel = new JPanel();
        
        // Create button component
        JButton button = new JButton("Button");

        // Add button to the panel
        buttonPanel.add(button);

        // Add the panel to the frame

        frame.add(buttonPanel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}

import java.awt.*;
import javax.swing.*;


public class GUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Test button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JButton button = new JButton("Click the button");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);

        JCheckBox checkBox = new JCheckBox();
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(checkBox);

        frame.add(panel);
        frame.setVisible(true);

    }

}
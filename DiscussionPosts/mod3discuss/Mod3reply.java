package mod3discuss;
import java.awt.FlowLayout;

import javax.swing.*;

public class Mod3reply {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button 1"));
        

        frame.add(panel);
        frame.setSize(300, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

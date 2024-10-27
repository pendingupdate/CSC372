package src.cta2opt2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GUIApp {
	public static void main(String[] args) {

		// ageFrame contains all GUI components
		JFrame ageFrame = new JFrame("Age Calculator");
		ageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ageFrame.setSize(350, 210);

		// userInputPanel contains user input components
		JPanel userInputPanel = new JPanel();

		// Set gridlayout for userInputPanel's layout manager 
		userInputPanel.setLayout(new GridLayout(3, 1));
		
		// ageOutputPanel contains age output display
		JPanel ageOutputPanel = new JPanel();

		// Label and TextField for birthdate input
		JLabel birthDateInputLabel = new JLabel("Enter your birth date (MM-DD-YYYY):");

		JTextField birthDateInputField = new JTextField();

		// calculateButton to calculate age on click 
		JButton calculateButton = new JButton("Calculate Age");

		// ageOutputLabel will display the calculated age
		JLabel ageOutputLabel = new JLabel("Your age will appear here.", SwingConstants.CENTER);

		// Add input components to the user input panel
		userInputPanel.add(birthDateInputLabel);
		userInputPanel.add(birthDateInputField);
		userInputPanel.add(calculateButton);

		// Add output components to age output panel
		ageOutputPanel.add(ageOutputLabel);

		// Add panels to the frame
		ageFrame.add(userInputPanel, BorderLayout.CENTER);
		ageFrame.add(ageOutputPanel, BorderLayout.SOUTH);

		// ActionListener for calculateButton
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String birthDateInput = birthDateInputField.getText();
				
				try {
					// Parse age from user input
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
					LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);
					LocalDate currentDate = LocalDate.now();

					// Calculate age
					int age = Period.between(birthDate, currentDate).getYears();

					// Display age
					ageOutputLabel.setText("You are " + age + " years old.");

				// Throw exception if birthdate input is incorrectly formatted	
				} catch (DateTimeParseException ex) {
					ageOutputLabel.setText("Invalid date format. Use MM-DD-YYYY.");
				}
			}
		});

		ageFrame.setVisible(true);
	}
}

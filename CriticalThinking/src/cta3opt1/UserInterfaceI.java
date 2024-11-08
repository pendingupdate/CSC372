package src.cta3opt1;

package org.example.cta3opt1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UserInterfaceI extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Interface I");

        // BorderPane layout manager for arranging components
        BorderPane borderPane = new BorderPane();

        // Display date and time in text box
        MenuItem selection1 = new MenuItem("Option 1: Display date and time");

        // Text box with default text "Text Box"
        TextField textBox = new TextField("Text Box");

        // Format for date and time display
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:m");

        // Action for selection1: Set current date and time in textBox
        selection1.setOnAction(event -> textBox.setText(localDateTime.format(formatter)));

        // Menu item for writing text box contents to a file
        MenuItem selection2 = new MenuItem("Option 2: Write text to file");

        String fileName = "log.txt"; // Filename for saving text box contents
        selection2.setOnAction(event -> {
            // Write the contents of textBox to a file
            try (FileWriter fileWriter = new FileWriter(fileName)) {
                fileWriter.write(textBox.getText());
                textBox.setText("Text saved to /log.txt!"); // Confirm successful save
            } catch (IOException e) {
                textBox.setText("Error: Could not save to file."); // Display error message in textBox if saving fails
            }
        });

        // Menu item to change the background color to a random green shade
        MenuItem selection3 = new MenuItem("Option 3: Generate green background");

        selection3.setOnAction(event -> {
            // Generate a random green shade in hex format
            int randomGreen = new Random().nextInt(256);
            String hexColor = String.format("#00%02x00", randomGreen);

            // Apply the generated green shade to the BorderPane background
            borderPane.setStyle("-fx-background-color: " + hexColor + ";");
            // Display the hex color value in the text box
            textBox.setText("Random green color: " + hexColor);
        });

        // Menu item to close the program
        MenuItem selection4 = new MenuItem("Option 4: Exit Program");

        // Action for selection4: Close the primary stage, ending the program
        selection4.setOnAction(event -> primaryStage.close());

        // Create menu button with all options and add it to an HBox
        MenuButton menuButton = new MenuButton("Options", null, selection1, selection2, selection3, selection4);
        
        // Arrange the menu button at the top and text box at the bottom of BorderPane
        borderPane.setTop(menuButton);
        borderPane.setBottom(textBox);

        // Set up the scene with the BorderPane and display the stage
        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package com.example.cta3opt1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MainApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Interface I");

        // Borderpane layout manager to organize GUI components
        BorderPane borderPane = new BorderPane();

        //  When the user selects the first menu option, then the date and time should be printed in a text box.
        MenuItem option1 = new MenuItem("Option 1: Display date and time");

        // Text box with default text
        TextField textBox = new TextField("Text Box");

        // Get date and time and set format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");

        // Display formatted date and time on click
        option1.setOnAction(event -> {
            LocalDateTime localDateTime = LocalDateTime.now();
            textBox.setText(localDateTime.format(formatter));
        });
        //  When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt."
        MenuItem option2 = new MenuItem("Option 2: Write text to file");

        String fileName = "log.txt";
        option2.setOnAction(event -> {
            try (FileWriter fileWriter = new FileWriter(fileName)) {
                fileWriter.write(textBox.getText());
                // Confirm successful save
                textBox.setText("Text saved to \"/log.txt!\"");
            } catch (IOException e) {
                // Display error message
                textBox.setText("Error: Could not save to file.");
            }
        });

        //  When the user selects the third menu item then the frame background color changes to random color hue of the color green.
        //  The menu option should display the initial random hue each time selected for a single execution of the program.
        MenuItem option3 = new MenuItem("Option 3: Generate green background");

        option3.setOnAction(event -> {
            // Generate a random shade of green
            int randomGreen = new Random().nextInt(256);
            String hexColor = String.format("#00%02x00", randomGreen);
            // Apply random green color to the background
            borderPane.setStyle("-fx-background-color: " + hexColor + ";");
            // Display the green hex value in the text box
            textBox.setText("Random green color: " + hexColor);
        });

        //  When the user selects the fourth menu option then the program exits.
        MenuItem option4 = new MenuItem("Option 4: Exit Program");
        option4.setOnAction(event -> primaryStage.close());

        // Menubutton contains all options
        MenuButton menuButton = new MenuButton("Options", null, option1, option2, option3, option4);

        // Add menu and textbox to borderPane
        borderPane.setTop(menuButton);
        borderPane.setBottom(textBox);

        // Add borderPane to scene and set dimensions of display
        Scene scene = new Scene(borderPane, 300, 300);

        // Add scene to primary stage
        primaryStage.setScene(scene);

        // Display primaryStage
        primaryStage.show();
    }
}

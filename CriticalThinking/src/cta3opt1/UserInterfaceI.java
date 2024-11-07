package org.example.cta3opt1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInterfaceI extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Interface I");

        MenuItem selection1 = new MenuItem("Option 1: Date & Time");
        //  When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt."
        MenuItem selection2 = new MenuItem("Option 2");
        //  When the user selects the third menu item then the frame background color changes to random color hue of the color green. The menu option should display the initial random hue each time selected for a single execution of the program. See https://www.w3schools.com/colors/colors_picker.aspLinks to an external site.
        MenuItem selection3 = new MenuItem("Option 3");
        //  When the user selects the fourth menu option then the program exits.
        MenuItem selection4 = new MenuItem("Option 4");

        TextField outputField = new TextField();

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:m");

        //  When the user selects the first menu option, then the date and time should be printed in a text box.
        selection1.setOnAction(event -> outputField.setText(localDateTime.format(formatter)));
        selection2.setOnAction(event -> System.out.println("Option 2 selected"));
        selection3.setOnAction(event -> System.out.println("Option 3 selected"));
        selection4.setOnAction(event -> System.out.println("Option 4 selected"));

        BorderPane borderPane = new BorderPane();
        MenuButton menuButton = new MenuButton("Options", null, selection1, selection2, selection3, selection4);
        HBox hbox = new HBox(menuButton);
        borderPane.setTop(hbox);
        borderPane.setBottom(outputField);
        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

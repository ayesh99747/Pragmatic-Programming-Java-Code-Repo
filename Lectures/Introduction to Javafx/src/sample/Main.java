package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Step 1: Extend javafx.application.Application and override start()
public class Main extends Application {

    // Step 7: Create the main method
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Step 2: Create a Button
        Button btn1 = new Button("Say, Hello World");

        // Step 6: Create an event for the button
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Hello World!");
            }
        });

        // Step 3: Create a layout and add button to it
        StackPane root = new StackPane();
        root.getChildren().add(btn1);

        // Step 4: Create a Scene
        Scene scene = new Scene(root, 600, 400);

        // Step 5: Prepare the Stage
        primaryStage.setTitle("First JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

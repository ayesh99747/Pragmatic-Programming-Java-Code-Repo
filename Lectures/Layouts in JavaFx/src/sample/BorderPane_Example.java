package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPane_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        // Add the node to the top of the screen
        borderPane.setTop(new Label("This will be at the top"));
        // Add the node to the left of the screen
        borderPane.setLeft(new Label("This will be at the left"));
        // Add the node to the right of the screen
        borderPane.setRight(new Label("This will be at the Right"));
        // Add the node to the centre of the screen
        borderPane.setCenter(new Label("This will be at the Centre"));
        // Add the node to the bottom of the screen
        borderPane.setBottom(new Label("This will be at the bottom"));
        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBox_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label("What type of music do you listen to?");
        CheckBox c1 = new CheckBox("Pop");
        CheckBox c2 = new CheckBox("Rock");
        CheckBox c3 = new CheckBox("Hip Hop");
        CheckBox c4 = new CheckBox("Country");
        HBox root = new HBox();
        root.getChildren().addAll(l, c1, c2, c3, c4);
        root.setSpacing(5);
        Scene scene = new Scene(root, 800, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CheckBox Example");
        primaryStage.show();
    }
}

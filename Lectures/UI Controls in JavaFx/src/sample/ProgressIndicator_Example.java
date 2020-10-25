package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ProgressIndicator_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ProgressIndicator PI = new ProgressIndicator();
        PI.setProgress(0.25f);
        StackPane root = new StackPane();
        root.getChildren().add(PI);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Progress Indicator Example");
        primaryStage.show();

    }
}

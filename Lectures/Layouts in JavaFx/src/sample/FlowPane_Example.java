package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FlowPane Example");
        FlowPane root = new FlowPane();
        // The vertical gap among the rows
        root.setVgap(6);
        // Horizontal gap between the columns.
        root.setHgap(5);
        // The preferred height or width where content should wrap in the horizontal
        // or vertical FlowPane.
        root.setPrefWrapLength(250);
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Stop"));
        root.getChildren().add(new Button("Reset"));
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

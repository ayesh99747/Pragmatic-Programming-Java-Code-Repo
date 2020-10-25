package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBox_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        HBox root = new HBox();
        Scene scene = new Scene(root, 600, 400);
        root.getChildren().addAll(btn1, btn2);
        // This represents the space between the nodes in the HBox.
        root.setSpacing(40);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

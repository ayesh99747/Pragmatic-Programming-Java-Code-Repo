package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBox_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 200);
        root.getChildren().addAll(btn1, btn2);
        // This property is to set some spacing among the nodes of VBox.
        root.setSpacing(40);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

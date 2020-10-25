package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HyperLink_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Hyperlink hp = new Hyperlink("http://www.google.com");
        StackPane root = new StackPane();
        hp.setOnAction(e -> System.out.println("Link Clicked"));
        root.getChildren().add(hp);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hyperlink Example");
        primaryStage.show();
    }
}

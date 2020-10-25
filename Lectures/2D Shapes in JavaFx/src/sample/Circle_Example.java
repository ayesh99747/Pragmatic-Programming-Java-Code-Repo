package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circle_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Circle Example");
        Circle circle = new Circle();
        // Setting the center coordinates
        circle.setCenterX(200);
        circle.setCenterY(200);
        // Setting the radius of the circle
        circle.setRadius(100);
        circle.setFill(Color.RED);
        Group group = new Group();
        group.getChildren().addAll(circle);
        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Arc_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Arc Example");
        Arc arc = new Arc();
        // Set the center coordinates of the arc
        arc.setCenterX(200);
        arc.setCenterY(200);
        // Setting the dimensions of the arc
        arc.setRadiusX(50);
        arc.setRadiusY(50);
        // Setting the angle at which the arc starts
        arc.setStartAngle(0);
        // Setting the length of the arc
        arc.setLength(100);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.RED);
        Group group = new Group();
        group.getChildren().addAll(arc);
        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

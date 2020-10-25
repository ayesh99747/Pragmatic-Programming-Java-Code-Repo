package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ellipse_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ellipse Example");
        Ellipse ellipse = new Ellipse();
        //Setting the center of the ellipse
        ellipse.setCenterX(100);
        ellipse.setCenterY(100);
        //Setting the width and the height in terms of radius
        ellipse.setRadiusX(50);
        ellipse.setRadiusY(80);
        Group group = new Group();
        group.getChildren().addAll(ellipse);
        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Polygon_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {
        Group root = new Group();
        primarystage.setTitle("Pollygon Example");
        Polygon polygon = new Polygon();
        // Setting the coordinates of the polygon using the addAll method
        polygon.getPoints().addAll(0.0, 0.0,
                100.0, 200.0,
                200.0, 100.0);
        root.getChildren().add(polygon);
        Scene scene = new Scene(root, 400, 400);
        primarystage.setScene(scene);
        primarystage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class QuadCurve_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {
        QuadCurve c = new QuadCurve();
        // X coordinate of starting point of quad curve
        c.setStartX(70);
        // Y coordinate of starting point of quad curve
        c.setStartY(30);
        // X coordinate of the control point of quad curve
        c.setControlX(250);
        // Y coordinate of the control point of quad curve
        c.setControlY(50);
        // X coordinate of the end point of quad curve
        c.setEndX(250);
        // Y coordinate of ending point of quad curve
        c.setEndY(300);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        Group root = new Group();
        root.getChildren().add(c);
        Scene scene = new Scene(root, 400, 400);
        primarystage.setTitle("QuadCurve Example");
        primarystage.setScene(scene);
        primarystage.show();
    }
}

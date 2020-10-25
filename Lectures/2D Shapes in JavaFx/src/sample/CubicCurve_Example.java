package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class CubicCurve_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {
        Group root = new Group();
        primarystage.setTitle("Cubic Curve Example");
        CubicCurve c = new CubicCurve();
        // X coordinate of starting point of cubic curve
        c.setStartX(20);
        // Y coordinate of starting point of cubic curve
        c.setStartY(100);
        // X coordinate of first control point of cubic curve.
        c.setControlX1(300);
        // Y coordinate of first control point of cubic curve
        c.setControlY1(100);
        // X coordinate of second control point of cubic curve
        c.setControlX2(200);
        // Y coordinate of second control point of cubic curve
        c.setControlY2(90);
        // X coordinate of end point of cubic curve
        c.setEndX(100);
        // Y coordinate of end point of cubic curve.
        c.setEndY(300);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        root.getChildren().add(c);
        Scene scene = new Scene(root, 400, 400);
        primarystage.setScene(scene);
        primarystage.show();
    }
}

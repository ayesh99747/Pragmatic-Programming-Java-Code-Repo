package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ScrollBar_Example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScrollBar s = new ScrollBar();
        s.setMin(0);
        s.setMax(200);
        s.setValue(110);
        s.setOrientation(Orientation.VERTICAL);
        s.setUnitIncrement(12);
        s.setBlockIncrement(10);
        StackPane root = new StackPane();
        root.getChildren().add(s);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ScrollBar Example");
        primaryStage.show();

    }
}

package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EventHandlerExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Creating Circle and setting the color and stroke in the circle
        Circle c = new Circle(100, 100, 50);
        c.setFill(Color.GREEN);
        c.setStroke(Color.BLACK);

        // Creating play button and setting coordinates for the button
        Button btn = new Button("Play");
        btn.setTranslateX(125);
        btn.setTranslateY(200);

        // Creating pause button and setting coordinate for the pause button
        Button btn1 = new Button("Pause");
        btn1.setTranslateX(175);
        btn1.setTranslateY(200);

        // Instantiating TranslateTransition class to create the animation
        TranslateTransition trans = new TranslateTransition();

        // Setting attributes for the TranslateTransition
        trans.setAutoReverse(true);
        trans.setByX(200);
        trans.setCycleCount(100);
        trans.setDuration(Duration.millis(500));
        trans.setNode(c);

        // Creating EventHandler
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() == btn) {
                    //animation will be played when the play button is clicked
                    trans.play();
                }
                if (event.getSource() == btn1) {
                    //animation will be paused when the pause button is clicked
                    trans.pause();
                }
                event.consume();
            }
        };

        //Adding Handler for the play and pause button
        btn.setOnMouseClicked(handler);
        btn1.setOnMouseClicked(handler);

        //Creating Group and scene
        Group root = new Group();
        root.getChildren().addAll(c, btn, btn1);
        Scene scene = new Scene(root, 420, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EventHandler example");
        primaryStage.show();
    }
}

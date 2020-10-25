package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectangle_Example extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rectangle Example");
        Rectangle rect = new Rectangle(); //instantiating Rectangle Object
        rect.setX(100); //setting the X coordinate of upper left corner of the rectangle
        rect.setY(100); //setting the Y coordinate of upper left corner of the rectangle
        rect.setWidth(200); //setting the width of rectangle
        rect.setHeight(100); // setting the height of rectangle
        Group group = new Group(); //creating Group
        group.getChildren().addAll(rect); //adding rectangle to the //group
        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

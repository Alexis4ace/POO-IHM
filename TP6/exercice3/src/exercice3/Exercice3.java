/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class Exercice3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Pane pane = new Pane();
        Circle cercle = new Circle(root.getWidth()/2, root.getHeight()/2, 10, Color.CORAL);
        pane.getChildren().add(cercle);
        
        root.setCenter(pane);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

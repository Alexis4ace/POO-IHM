/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class exercice4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        HBox root = new HBox();
        Button btn1 = new Button();
        btn1.setText("un");
        Button btn2 = new Button();
        btn2.setText("deux");
        Button btn3 = new Button();
        //btn3.setPadding(new Insets(40,40,40,40));
        btn3.setText("trois");
        btn3.setStyle("-fx-font-size:25");
        Button btn4 = new Button();
        btn4.setText("quatre");
        Button btn5 = new Button();
        btn5.setText("cinq");
        Button btn6 = new Button();
        btn6.setText("six");
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6);
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
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

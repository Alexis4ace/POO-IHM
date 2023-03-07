/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class Exercice1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
        Scene scene = new Scene(root , 1400 , 800 , Color.BEIGE);
        
        Label lA = new Label("TEXT A");
        lA.setLayoutX(scene.getWidth()/5);
        lA.setLayoutY(scene.getHeight()/3);
        TextField tfA = new TextField();
        tfA.setLayoutX(scene.getWidth()/5);
        tfA.setLayoutY( (scene.getHeight()/3)*2 );
        
        
        Label lB = new Label("TEXT B");
        lB.setLayoutX( (scene.getWidth()/5) * 2);
        lB.setLayoutY(scene.getHeight()/3);
        TextField tfB = new TextField();
        tfB.setLayoutX( (scene.getWidth()/5) * 2 );
        tfB.setLayoutY( (scene.getHeight()/3)* 2 );
        
        Label lC = new Label("TEXT C");
        lC.setLayoutX((scene.getWidth()/5) * 3);
        lC.setLayoutY(scene.getHeight()/3);
        TextField tfC = new TextField();
        tfC.setLayoutX( (scene.getWidth()/5) * 3);
        tfC.setLayoutY( (scene.getHeight()/3)* 2 );
        
        Label lD = new Label("TEXT D");
        lD.setLayoutX( (scene.getWidth()/5)*4);
        lD.setLayoutY(scene.getHeight()/3);
        TextField tfD = new TextField();
        tfD.setLayoutX( (scene.getWidth()/5) * 4);
        tfD.setLayoutY( (scene.getHeight()/3)*2 );
      
        Label lE = new Label("TEXT E");
        lE.setLayoutX( (scene.getWidth()));
        lE.setLayoutY(scene.getHeight()/3);
        TextField tfE = new TextField();
        tfE.setLayoutX( (scene.getWidth()));
        tfE.setLayoutY( (scene.getHeight()/3)*2 );
        

        tfA.textProperty().bindBidirectional(tfB.textProperty());
        tfC.textProperty().bindBidirectional(tfB.textProperty());

        root.getChildren().addAll(lA,tfA);
        root.getChildren().addAll(lB,tfB);
        root.getChildren().addAll(lC,tfC);
        root.getChildren().addAll(lD,tfD);
        root.getChildren().addAll(lE,tfE);
        
        Button resetE = new Button("reset E");
        resetE.setLayoutX(scene.getWidth());
        resetE.setLayoutY(scene.getHeight()-50);
        resetE.addEventFilter(ActionEvent.ACTION, event ->     
        {
            tfE.setText("ICI c'est E");
        });
        
        Button DinE = new Button("D -> E");
        DinE.setLayoutX((scene.getWidth()/5)*4);
        DinE.setLayoutY(scene.getHeight()-50);
        DinE.addEventFilter(ActionEvent.ACTION, event ->     
        {
            tfE.textProperty().bind(tfD.textProperty());
        });
                   
        root.getChildren().addAll(resetE,DinE);
        
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

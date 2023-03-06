/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class exercice3 extends Application {
    
    
   
    
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane flowpane = new FlowPane();  // children
        flowpane.setAlignment(Pos.CENTER); //pos des boutons
        flowpane.setOrientation(Orientation.VERTICAL); // orientation des bouton
        flowpane.setVgap(5); //espacement vertical
        flowpane.setHgap(30); // espacement horizontal
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        
        flowpane.getChildren().add(btn6);
        btn6.setText("Un");
        flowpane.getChildren().add(btn5);
        btn5.setText("Deux");
        flowpane.getChildren().add(btn4);
        btn4.setText("Trois");        
        flowpane.getChildren().add(btn3);
        btn3.setText("Quatre"); 
        flowpane.getChildren().add(btn2);
        btn2.setText("Cinq"); 
        flowpane.getChildren().add(btn1);
        btn1.setText("Six"); 
        
        
        BorderPane BP = new BorderPane(); // pas de children
        Button btn_haut = new Button();
        btn_haut.setText("HAUT");
        
        Button btn_bas = new Button();
        btn_bas.setText("BAS");
        Button btn_gauche = new Button();
        btn_gauche.setText("GAUCHE");
        Button btn_droite = new Button();
        btn_droite.setText("DROITE");
        Button btn_centre = new Button();
        btn_centre.setText("CENTRE");
        
        
        
        BP.setTop(btn_haut);
        BorderPane.setAlignment(btn_haut, Pos.CENTER);
        BP.setBottom(btn_bas);
        BorderPane.setAlignment(btn_bas, Pos.CENTER);
        BP.setLeft(btn_gauche);
        BorderPane.setAlignment(btn_gauche, Pos.CENTER);
        BP.setRight(btn_droite);
        BorderPane.setAlignment(btn_droite, Pos.CENTER);
        BP.setCenter(btn_centre);
        BorderPane.setAlignment(btn_centre, Pos.CENTER);
        
        
        
        
        
       
        
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
            }
        });
        
        //StackPane root = new StackPane();
        //root.getChildren().add(flowpane);
        
        
        Scene scene = new Scene(BP, 1200,600);
        
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

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
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Antoine Bergey
 */
public class HelloWorldLabel extends Application {
    
    // start est appelée automatiquement pour lancer l'application, 
    // elle a en parametre la fenetre principale. 
    @Override
    public void start(Stage primaryStage) {
        // On crée l'étiquette  
        //BorderStroke bs = new BorderStroke(Color.blue, BorderStrokeStyle.SOLID, new CornerRadii(5));
        BorderStroke bs = new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID , new CornerRadii(0),BorderWidths.DEFAULT);
        
        Label monLabel = new Label();
        monLabel.setText("OeilDroit");
        monLabel.setLayoutX(190);
        monLabel.setLayoutY(20);
        //monLabel.setBorder(new Border(bs));
        monLabel.setPadding(new Insets(10,10,10,10));
        monLabel.setStyle("-fx-border-color:blue ; -fx-border-witdh:10 ; -fx-border-radius:5 ; -fx-background-color:blue");
        /*Label monLabel2 = new Label();
        monLabel2.setText("Guten Tag ");
        monLabel2.setLayoutX(30);
        monLabel2.setLayoutY(30);
        
        Label monLabel3 = new Label();
        monLabel3.setText("Bonjour ");
        monLabel3.setLayoutX(50);
        monLabel3.setLayoutY(50);
        
        Label monLabel4 = new Label();
        monLabel4.setText(" SALUT");
        monLabel4.setLayoutX(70);
        monLabel4.setLayoutY(70);*/
        
        Line l = new Line(100,180,200,180);
       
        
        
        Button btn = new Button();
        btn.setText("OeilGauche");
        btn.setLayoutX(40);
        btn.setLayoutY(20);
        btn.setStyle("-fx-background-color:black");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                l.setStartY(l.getStartY()+5);
                l.setEndY(l.getEndY()+5);
            
            }
        });
        
        Circle cercle = new Circle( 150 , 100 , 40, Color.RED);
        /*cercle.setLayoutX(150);
        cercle.setLayoutY(100);
        cercle.setRadius(40);
        cercle.setFill(Color.RED);*/
        
        
        // root, qui sera la racine de la fenêtre est un Pane (panneau sans 
        // gestionnaire de placement)
        Pane root = new Pane();
        // on place l'étiquette monLabel à l'intérieur de root
        root.getChildren().addAll(monLabel,btn,cercle,l   /*monLabel2,monLabel3,monLabel4*/   ); 
       
       
        
        // On crée la scène (la zone intérieure de la fenètre)
        // elle a le Pane root comme intérieur, et on dit qu'elle fait 300 x 250 pixels.  
        Scene scene = new Scene(root, 300, 250);
        
        // On indique le titre de la fenêtre principale 
        primaryStage.setTitle("Hello World!");
        // On met la scene dans la fenêtre principale
        primaryStage.setScene(scene);
        // On montre la fenêtre principale
        primaryStage.show();
    }

    /**
     * Fonction main par défaut 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lance l'application 
        launch(args);
      
    }
    
}


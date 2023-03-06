/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublefenetre;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class Doublefenetre extends Application {
    
    @Override
    public void start(Stage primaryStage ) {
        
        Label lSecondOuvert = new Label("FERMER");
        lSecondOuvert.setLayoutX(150);
        lSecondOuvert.setLayoutY(50);
        
        SecondeFenetre scene2 = new SecondeFenetre();
        
        TextField tfPrincipal = new TextField("PREMIER TXT");
        tfPrincipal.setLayoutX(0);
        tfPrincipal.setLayoutY(50);
        
        Button envoi = new Button("envoi");
        
        envoi.setLayoutX(150);
        envoi.setLayoutY(75);
        envoi.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                scene2.afficheMessage(tfPrincipal.getText());
                lSecondOuvert.setText("OUVERT");
                scene2.show();
            }
        });

     
        Pane root = new Pane();
        root.getChildren().addAll(tfPrincipal,envoi,lSecondOuvert);
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

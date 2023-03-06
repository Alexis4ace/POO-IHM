/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.Action;

/**
 *
 * @author abottin
 */
public class TP4 extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        
        Label labMessage = new Label("MESSAGE");
        labMessage.setLayoutX(225);
        labMessage.setLayoutY(20);
        
        Button b1 = new Button("b1");
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.setOnAction( new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("b1");
            }
        
        }
        );
        
        
        Button b2 = new Button("b2");
        b2.setLayoutX(300);
        b2.setLayoutY(100);
        b2.setOnAction( new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("b2");
            }
        
        }
        );
        
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500);
        
        Circle c = new Circle(250,350,100);
        c.setFill(Color.RED);
        
        
        
        Ecouteur ecoute3_1 = new Ecouteur("Ecoute1 filter b2",true);
        b1.addEventFilter(MouseEvent.MOUSE_CLICKED, ecoute3_1);
        Ecouteur ecoute3_2 = new Ecouteur("Ecoute2 filter root",false);
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, ecoute3_2);
        Ecouteur ecoute3_3 = new Ecouteur("Ecoute3 filter scene",false);
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, ecoute3_3);
        
        Ecouteur ecoute1 = new Ecouteur("Ecoute1 HAND btn 1",false);
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, ecoute1);
        Ecouteur ecoute2 = new Ecouteur("Ecoute2 HAND root",false);
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, ecoute2);
        Ecouteur ecoute3 = new Ecouteur("Ecoute3 HAND scene",false);
        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, ecoute3);
        
        root.getChildren().addAll(b1,b2,c,labMessage);
        
        
        

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public class Ecouteur implements EventHandler{
        private final String message ;
        private final boolean stop ;
        public Ecouteur(String S,boolean stop ){
            this.message = S ;
            this.stop = stop;
        }
        
        @Override
        public void handle(Event event) {
            if( event.getSource().getClass() == Button.class || event.getTarget().getClass() == Scene.class || event.getTarget().getClass() == Scene.class)
            {event.consume();}
            else 
                System.out.println(this.message);
      
                    
                
          
        }
        
    }
    
}

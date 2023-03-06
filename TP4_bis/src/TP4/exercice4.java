/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class exercice4 extends Application {
    private int cpt = 10 ;
    @Override
    public void start(Stage primaryStage) {
        Label msg = new Label( String.valueOf(cpt) );
        msg.setLayoutX(200);
        msg.setLayoutY(25);
        
        
        Circle c = new Circle(200,200,10);
        c.setRadius(cpt);
     
        
        
        
        Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(25);
        btn.setText("+5");
        btn.addEventHandler(ActionEvent.ACTION, 
                event -> {
                    this.cpt +=5;
                    c.setRadius(cpt);
                    msg.setText(String.valueOf(cpt));}
        );
        
        Button btn2 = new Button();
        btn2.setLayoutX(300);
        btn2.setLayoutY(25);
        btn2.setText("-5");
        btn2.addEventHandler(ActionEvent.ACTION, 
                event -> {
                    if(cpt-5 >= 0)
                        this.cpt -=5;
                    c.setRadius(cpt);
                    msg.setText(String.valueOf(cpt));}
        );
        
        
        Button quit = new Button();
        quit.setText("QUITTER");
        quit.setLayoutX(340);
        quit.setLayoutY(375);
        quit.addEventHandler(ActionEvent.ACTION,
                event -> {
                    Platform.exit();} 
        );
        
        
        Pane root = new Pane();
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
        {   
            c.setCenterX(event.getX());
            c.setCenterY(event.getY());
        });
        root.addEventHandler(MouseEvent.MOUSE_DRAGGED, event->
        {
            c.setCenterX(event.getX());
            c.setCenterY(event.getY());
        });
        root.getChildren().addAll(btn,btn2,quit,msg,c);
        
        Scene scene = new Scene(root, 400, 400);
        
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

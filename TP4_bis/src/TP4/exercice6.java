package TP4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

/**
 *
 * @author abottin
 */

public class exercice6 extends Application {
    
    
     public class BorderWithQuit implements EventHandler{
        public Button btn;
        
        public BorderWithQuit(){
            this.btn = new Button();
            btn.setText("QUITTER");
            btn.setLayoutX(340);
            btn.setLayoutY(375);
            btn.addEventHandler(ActionEvent.ACTION, this);
        }
        public Button getButton(){
            return this.btn;
        }
        @Override
        public void handle(Event event) {
            Platform.exit();}  
    }
    
    public class ButtonStartPause extends Button{
        int img = 1 ;
        int size ;
        public ButtonStartPause(int size){
            
            this.size = size;
            //this.change();
            this.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                change();
                
            }
        });
            
        }
        
        public void change(){
            if(this.img == 1){
                Image imageL = new Image(getClass().getResourceAsStream("TP_04_lecture.png"),size,size,false,false);
                ImageView iconeL = new ImageView(imageL);
                this.setGraphic(iconeL);
                this.img = 1- this.img;
            }
            else {
                Image imageP = new Image(getClass().getResourceAsStream("TP_04_pause.png"),size,size,false,false);
                ImageView iconeP = new ImageView(imageP);
                this.setGraphic(iconeP);
                this.img = 1 - this.img;
            }
        }
        
        
    } 
     
    @Override
    public void start(Stage primaryStage) {
        
        Image imageP = new Image(getClass().getResourceAsStream("TP_04_pause.png"));
        ImageView iconeP = new ImageView(imageP);
        
        Image imageL = new Image(getClass().getResourceAsStream("TP_04_play.png"));
        ImageView iconeL = new ImageView(imageL);
        
        Button pause = new Button("PAUSE",iconeP);
        pause.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button lecture = new Button("LECTURE",iconeL);
        lecture.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        BorderWithQuit quit = new BorderWithQuit();
        
        //FlowPane root = new FlowPane();
        //root.getChildren().addAll(lecture,pause,quit.getButton());
        
        ButtonStartPause b = new ButtonStartPause(40);
        b.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        ButtonStartPause b2 = new ButtonStartPause(3000);
       
        
        BorderPane root = new BorderPane();
       
        root.setBottom(b);
        root.setCenter(b2);
        
        Scene scene = new Scene(root, 300, 125);
        
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class exercice5 extends Application {

    //--------debut class MYBUTTON-----------------
    public class MyButton extends Button {
        private int line;
        private int column;
        private String txt;
        
        public MyButton(int column , int line){
            this.setColumn(column);
            this.setLine(line);
            setLayoutX(column);
            setLayoutY(line);
            this.setText(txt);
            this.addEventFilter(ActionEvent.ACTION, event ->{ this.handle(event);});
        }
        
        public void setLine(int line){
            this.line = line ;
            this.txt = "("+String.valueOf(column)+"," + String.valueOf(line)+")";
        } 
        
        public void setColumn(int column){
            this.column = column;
            this.txt = "("+String.valueOf(column)+"," + String.valueOf(line)+")";

        }
     
        public int getLine(){
            return this.line;
        }
        public int getColumn(){
            return this.column;
        }
        public void handle(Event event) {
            this.setLayoutX(column);
            this.setLayoutY(line);
            this.setText(txt);
        }
    }
    //---------------------FIN CLASS MYBUTTON-------------------
    
    //------------------DEBUT CLASS BORDERWITHQUIT--------------------
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
    //----------------------FIN CLASS BORDERWITHQUIT--------------
    
    //------------------DEBUT CLASS MYBUTTONTEST-----------------------
    public class MyButtonTest extends Scene{
        
        public MyButton b = new MyButton(Integer.valueOf(getParameters().getNamed().get("arg1")),Integer.valueOf(getParameters().getNamed().get("arg2")));
        public BorderWithQuit q = new BorderWithQuit(); ;
        public Label lb = new Label(b.getText());
       

        public MyButtonTest(BorderPane root) {
            super(root,400,400);
            root.setTop(lb);
            root.setBottom(q.getButton());
            root.setCenter(b);
        }

        public Label getLabel(){
            return this.lb;
        }
        
        public MyButton getButton(){
            return this.b;
        }
        
        public BorderWithQuit getBorderWithQuit(){
            return this.q;
        }
   
    }
    //--------------------FIN CLASS MYBUTTONTEST----------------------
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        BorderPane root = new BorderPane();
        MyButtonTest scene= new MyButtonTest(root);
       
        
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

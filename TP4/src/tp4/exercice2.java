/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class exercice2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label labMessage = new Label("MESSAGE");
        labMessage.setLayoutX(225);
        labMessage.setLayoutY(20);
        
        Ecouteur e = new Ecouteur("yooo",false);
        
        Button b1 = new Button("b1");
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.setOnAction( new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //b1.addEventFilter(ActionEvent.ACTION, e);
            }
        
        }
        );
       
        
        Button b2 = new Button("b2");
        b2.setLayoutX(300);
        b2.setLayoutY(100);
        
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500);
        
        Circle c = new Circle(250,350,100);
        c.setFill(Color.RED);
        
        EcouteurClic click = new EcouteurClic(labMessage) ;
        
      
        
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, click);
        
        Ecouteur ecoute3_1 = new Ecouteur("Ecoute1 filter b1",false);
        b1.addEventHandler(ActionEvent.ACTION, ecoute3_1);
        b2.addEventHandler(ActionEvent.ACTION, ecoute3_1);
        c.addEventHandler(ActionEvent.ACTION, ecoute3_1);
        root.addEventHandler(ActionEvent.ACTION, ecoute3_1);
        labMessage.addEventHandler(ActionEvent.ACTION, ecoute3_1);
        ecoute3_1.setBtn(b1,b2);
        ecoute3_1.setCircle(c);
        ecoute3_1.setPane(root);
        ecoute3_1.setLabel(labMessage);
       
        
        
        Ecouteur ecoute1 = new Ecouteur("Ecoute1 HAND btn 1",false);
        //b1.addEventHandler(MouseEvent.MOUSE_CLICKED, ecoute1);
       
       
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
    public class EcouteurClic implements EventHandler{
        private final Label mesg;
       
        public EcouteurClic(Label l){
            this.mesg = l ;
        }
  
        public void afficheCoord(){
            
           // mesg.setText("coord x : "+this.e.getX() + " coord y : " + this.e.getY() );
        }
        @Override
        public void handle(Event event) {
          
            
        }

      

        
    
    }
    public class Ecouteur implements EventHandler{
        private final String message ;
        private final boolean stop ;
        private Button btn1;
        private Button btn2;
        private Circle cercle;
        private Label lab;
        private Pane root;
        public void setLabel(Label c){
            this.lab= c;
        }
        public void setPane(Pane c){
            this.root = c;
        }
        public void setCircle(Circle c){
            this.cercle = c;
        }
        public void setBtn(Button b1 , Button b2){
            this.btn2=b2;
            this.btn1=b1;
        }
        public Ecouteur(String S,boolean stop ){
            this.message = S ;
            this.stop = stop;
        }
        public void affiche(Object o){
            if ( o==this.btn1)
                System.out.println("JE SUIS BOUTON 1");
            else if ( o==this.btn2)
                System.out.println("JE SUIS BOUTON 2");
            else if ( o==this.cercle)
                System.out.println("JE SUIS CERCLE ");
            else if ( o==this.root)
                System.out.println("JE SUIS PANNEAU");
            else if ( o==this.lab)
                System.out.println("JE SUIS LABEL");
            else
                System.out.println("JE SUIS RIEN");
        }
        @Override
        public void handle(Event event) {
            if( this.stop)
                {event.consume();}
            else {
                affiche(event.getSource());
                Ecouteur e3 = new Ecouteur("nouveau",false);
               // btn1.setOnAction(e3);
                
            }    
        }
    }
}

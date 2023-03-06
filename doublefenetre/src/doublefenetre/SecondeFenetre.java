/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublefenetre;


import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

/**
 *
 * @author abottin
 */
public class SecondeFenetre extends Stage {
    
    public TextField tfSecondaire ;
    
    public SecondeFenetre(){
        this.tfSecondaire = new TextField("default");
        
        Pane root = new Pane();
        root.getChildren().add(tfSecondaire);
        
        this.setScene(new Scene(root , 500,500));
    }
     
    public void afficheMessage(String m){
        this.tfSecondaire.setText(m);
    }
     public void setOnTextChangedd(EventHandler eh){
         this.addEventHandler(EventType.ROOT, eh);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc1;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javax.swing.event.ChangeListener;


/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author abottin
 */
public class MonSliderInerte extends Slider{
    public int val = (int) (0.5 *100) ;
    public Label lval = new Label(Integer.toString(val));
    
    public MonSliderInerte(Pane root , int x , int y){
        super(0,1,0.5);
       
        this.setPrefWidth(200);
        this.setPrefHeight(20);
        this.setLayoutX(x);
        this.setLayoutY(y);
        
        this.setOnScroll( event -> {
                    
                    double v = ((Slider) event.getSource()).getValue();
                    this.changeVal(v);
                    }
        );
       
 
        this.setOnMouseDragged(
                event -> {
                    this.changeVal(this.getValue());
                    }
        );
        this.setOnMouseClicked(
                event -> {
                    this.changeVal(this.getValue());
                }
        );
       
        Border b = new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        this.setBorder(b);
        
        lval.setLayoutX(x-30);
        lval.setLayoutY(y);
        root.getChildren().add(lval);
    }
    
    public void changeVal(double x ){
        this.val = (int) (x * 100) ;
        this.lval.setText(Integer.toString(val));
    }
    
    public int getVal(){
        return val ;
    }
    
    public Label getLabel(){
        return lval;
    }
 
    

}

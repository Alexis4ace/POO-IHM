/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.util.converter.NumberStringConverter;

/**
 *
 * @author abottin
 */
public class SliderBetter extends HBox {
    
    public Label l = new Label();
    public TextField tfValue = new TextField();
    public Slider s = new Slider(0,1,1);

    
    public SliderBetter(String sLabel , double min , double max , double value){
        
        this.l.setText(sLabel);
        this.s.setMin(min);
        this.s.setMax(max);
        this.s.setValue(value);
      
        this.getChildren().addAll(l,tfValue,s);
        this.setAlignment(Pos.CENTER);
        
        
        this.l.textProperty().bind(Bindings.convert(this.valueProperty()));
        
        
        this.tfValue.textProperty().bindBidirectional(this.valueProperty(),new NumberStringConverter());
    }
    
    public double getMin(){
        return this.s.getMin();
    }
    
    public double getMax(){
        return this.s.getMax();
    }
    
    public double getValue(){
        return this.s.getValue();
    }
    
    public DoubleProperty valueProperty(){
        return this.s.valueProperty();
    }
    
    
    
}
